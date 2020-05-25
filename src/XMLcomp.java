
//Imports
import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileOutputStream;
import java.utill.*;
import org.xmlunit.builder.*;
import org.xmlunit.diff.*
import org.xmlunit.util.Predicate;
import org.w3c.dom.Attr;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCellStyle
import org.apache.poi.xssf.usermodel.XSSFFont

//Define Properties
def date = testRunner.testCase.getPropertyValue("date");
def projectPath = new com.eviware.soapui.support.GroovyUtils(context).projectPath + "/Data/Output/"
testRunner.testCase.testSuite.project.setPropertyValue("projectPath", projectPath)
def channel="SABRE"
def date2 = testRunner.testCase.getPropertyValue("date2");
def projectname=testRunner.testCase.testSuite.project.name
def cabinColorSchema = "The Shoping List: PASTL. The list following furniture items: BA¹ERA-TUB, TEL»FONO-PHONE, CAJA FUERTE-SAFE."
def cabinColorSchema1 = "The Shoping List: PASTL. The list following furniture items: BAÑERA-TUB, TELÉFONO-PHONE, CAJA FUERTE-SAFE"
def furnitureItem = "The Shoping List: NUTRL. The shpoingList following furniture items:"
def furnitureItem1 = "The Shoping List: NUTRL."
def shipDep = "INVALID SHIP/DEPARTURE DATE - ICSLMD."
def shipDep1 = "INVALID SHIP/DEPARTURE DATE - ICSLMD"

//Big Decimal Class
public class BigDecimalXmlDifferenceEvaluator implements DifferenceEvaluator {
@Override
public ComparisonResult evaluate(Comparison comparison, ComparisonResult result) {
if (result == ComparisonResult.EQUAL)
return result;
final Node controlNode = comparison.getControlDetails().getTarget();
final Node testNode = comparison.getTestDetails().getTarget();
if (!"".contains(controlNode.getTextContent()) && !"".contains(testNode.getTextContent()) && controlNode.getTextContent().endsWith(".00") && testNode.getTextContent().endsWith(".0")) {
if (new BigDecimal(controlNode.getTextContent()).compareTo(new BigDecimal(testNode.getTextContent())) == 0) {
return ComparisonResult.SIMILAR;
}
}
return result;
}
}

//String Converstion Methods
public String xmlString(File xmlFile) throws IOException {
Reader fileReader = new FileReader(xmlFile);
BufferedReader bufReader = new BufferedReader(fileReader);
StringBuilder sb = new StringBuilder();
String line = bufReader.readLine();
while (line != null) {
sb.append(line).append("\n");
line = bufReader.readLine();
}
return sb.toString();

}

//Method to get only ending with '_RS' files
public List folderSize(File directory) {
int length = 0;
List list = new ArrayList();
String filname = "";
for (File file : directory.listFiles()) {
if (file.isFile() && file.getName().contains("_RS.xml")){
length = length + 1;
list.add(file.getName());
}
}
return list;
}

//Create Excel Sheet to Store Comparison Results
XSSFWorkbook wb = new XSSFWorkbook()
def Dir = new File("C:\\SVN\\Testing\\CAPI\\TA\\Services\\FIT\\CategoryList2\\Data\\Output" + "\\" + "ComparisonResults" + "\\" + date).mkdirs();
OutputStream comparisonFile = new FileOutputStream("C:\\SVN\\Testing\\CAPI\\TA\\Services\\FIT\\CategoryList2\\Data\\Output" + "\\" + "ComparisonResults" + "\\" + date + "\\" + channel + "_" + date2 + ".xlsx");
XSSFSheet sheet1 = wb.createSheet('ComparisonResults');
wb.write(comparisonFile);

//Get Files from Channel Folders
String filePath = ("C:\\SVN\\Testing\\CAPI\\TA\\Services\\FIT\\CategoryList2\\Data\\Output\\"+channel+"\\"+"20190820_171944\\RLH_WESB");
String filePath1 = ("C:\\SVN\\Testing\\CAPI\\TA\\Services\\FIT\\CategoryList2\\Data\\Output\\"+channel+"\\"+"20190820_171944\\RLH_JAVA");
try {
//Comparision of two files
list = folderSize(new File(filePath));
log.info list.size();
for(int i = 0; i<list.size();i++){
log.info "PRATHAP"
File wesBResXML = new File(filePath+list.get(i));
File javaResXML = new File(filePath1+list.get(i));

//Set Prtoperties for reporting
testRunner.testCase.setPropertyValue("wesBResponseFile",wesBResXML.getName())
testRunner.testCase.setPropertyValue("wesBResponse",wesBResXML.getText())
testRunner.testCase.setPropertyValue("javaResponseFile",javaResXML.getName())
testRunner.testCase.setPropertyValue("javaResponse",javaResXML.getText())
testRunner.testCase.setPropertyValue("testCase",("TC_"+i))
testRunner.testCase.setPropertyValue("rows", (list.toString()))

//Comparision
//List of ignorable nodes
def nodeFilter = new Predicate<Node>() {
   public boolean test(Node element) {
    def eleName = element.getLocalName()
   
    if(eleName.equals('CabinFilter')&& eleName != null){
    def cabinFilterChildNodes = element.hasAttributes();        
    if(!cabinFilterChildNodes){
    def elementsToIgnore = ['CabinFilter']
        return !elementsToIgnore.contains(element.getLocalName())
    }
  }
    if(eleName.equals('Warning')&& eleName != null){
    def eleWarnValue = element.getTextContent()
    if(eleWarnValue.equals(shipDep)){
    element.setTextContent(shipDep1)
    }
    }
    else if(eleName.equals('Remark') && eleName != null){
    def eleWarnValue = element.getTextContent()
    if(eleWarnValue.equals(cabinColorSchema)){
    element.setTextContent(cabinColorSchema1)
    }
    }
    else if(eleName.equals('Remark') && eleName != null){
   
    def eleWarnValue = element.getTextContent()
    if(eleWarnValue.equals(furnitureItem)){
    element.setTextContent(furnitureItem1)
    }
    }

else if(eleName.equals('Envelope')&& eleName != null){
    def eleEnvValue = element.getPrefix()
    if(eleEnvValue.equals('soapenv')){
    element. setPrefix('SOAP-ENV')
    }
    }
   else if(eleName.equals('Body')&& eleName != null){
    def eleEnvValue = element.getPrefix()
    if(eleEnvValue.equals('soapenv')){
    element. setPrefix('SOAP-ENV')
    }
    }
       def elementsToIgnore = [ 'Header', 'TextScreens1',  'TextScreens',' TextScreen', 'TextData', 'Success']
       return !elementsToIgnore.contains(element.getLocalName())
   }
}
//List of ignorable attributes
def attributeFilter = new Predicate<Attr>() {
public boolean test(Attr attribute) {
def  attName = attribute.getName();
def  attValue = attribute.getValue()
if(attName.equals("Version")&& attName != null){
def attEchoValue1 = attribute.getValue();
if(attEchoValue1.equals('11')){
attribute.setValue('1.0')
}
}
if(attName.equals("EchoToken")&& attName != null){
def attEchoValue = attribute.getValue()as int
if(attEchoValue == 1){
def attributesToIgnore = ['EchoToken']
 return !attributesToIgnore.contains(attribute.getLocalName())
}else{
def attributesToIgnore = ['']
return !attributesToIgnore.contains(attribute.getLocalName())
}
}
else{
def attributesToIgnore = []
return !attributesToIgnore.contains(attribute.getLocalName())
}
}
}
     
final  diff = DiffBuilder.compare(wesBResXML)
       .withTest(javaResXML)
       .withNodeFilter(nodeFilter)
       .withAttributeFilter(attributeFilter)
       .ignoreComments()
       .ignoreWhitespace()
       .ignoreElementContentWhitespace()
       .checkForSimilar()
      .withNodeMatcher(new DefaultNodeMatcher(ElementSelectors.byNameAndText))
       .withNodeMatcher(new DefaultNodeMatcher(ElementSelectors.conditionalBuilder().whenElementIsNamed("CabinFilter").thenUse(ElementSelectors.byNameAndAttributes("CabinFilterCode")).elseUse(ElementSelectors.byName).build()))
   //    .withDifferenceEvaluator(new BigDecimalXmlDifferenceEvaluator())
        .build();

//Store And Print All Differences
List<String> diffList = new ArrayList<String>();
   if(diff.hasDifferences()){
    testRunner.testCase.setPropertyValue("comparisonStatus","Fail")
   
    for (Difference d : diff.getDifferences()) {  
    diffList.add(d);
    log.error d  
}
   }else{
testRunner.testCase.setPropertyValue("comparisonStatus","Pass"+"-"+diff)
    assert diff.hasDifferences()==false
   }

def diffList2 = diffList.toString();
testRunner.testCase.setPropertyValue("differencesList",diffList2)

//Report
//Define properties
def testCase1 = testRunner.testCase.getPropertyValue("testCase");
def javaResponseFile = testRunner.testCase.getPropertyValue("javaResponseFile");
def wesBResponseFile = testRunner.testCase.getPropertyValue("wesBResponseFile");
def comparisonResult = testRunner.testCase.getPropertyValue("comparisonStatus");
def differencesList = testRunner.testCase.getPropertyValue("differencesList");

//Styling objects
cellStyle= ((XSSFWorkbook) wb).createCellStyle();
XSSFFont font = ((XSSFWorkbook) wb).createFont();
font.setBoldweight(XSSFFont.BOLDWEIGHT_BOLD);
font.setFontHeightInPoints((short)12);
font.setFontName("Calibri");
cellStyle.setFont(font);

//Set Headers
Row header = sheet1.createRow(0);
Cell headerCell = header.createCell((short)0).setCellValue("Project Name")
Cell headerCell1 = header.createCell((short)1).setCellValue("TestCase");
Cell headerCell2 = header.createCell((short)2).setCellValue("WesB Response File Name");
Cell headerCell3 = header.createCell((short)3).setCellValue("Java Response File Name");
Cell headerCell4 = header.createCell((short)4).setCellValue("Comparison Status");
Cell headerCell5 = header.createCell((short)5).setCellValue("Differences List");

//Set Header Styles
header.getCell((short)0).setCellStyle(cellStyle);
header.getCell((short)1).setCellStyle(cellStyle);
header.getCell((short)2).setCellStyle(cellStyle);
header.getCell((short)3).setCellStyle(cellStyle);
header.getCell((short)4).setCellStyle(cellStyle);
header.getCell((short)5).setCellStyle(cellStyle);

//Set Values
try {
        XSSFRow row1 = sheet1.getRow(i);
if (row1 == null) {
row = sheet1.createRow(i);
    row.createCell((short) 0).setCellValue(projectname);
row.createCell((short) 1).setCellValue(testCase1);
row.createCell((short) 2).setCellValue(wesBResponseFile);
row.createCell((short) 3).setCellValue(javaResponseFile);
row.createCell((short) 4).setCellValue(comparisonResult);
row.createCell((short) 5).setCellValue(differencesList);
FileOutputStream fileOut = new FileOutputStream("C:\\SVN\\Testing\\CAPI\\TA\\Services\\FIT\\CategoryList2\\Data\\Output" + "\\" + "ComparisonResults" + "\\" + date + "\\" + channel + "_" + date2 + ".xlsx");
wb.write(fileOut);
wb.close(fileOut)
}
}
catch(IllegalArgumentException  e){
}

}
}
catch(FileNotFoundException e2){
}




















public class XMLcomp {

}
