package encasulation;

public class EncapExmp1 {
	
	private int  empid ;
	
	private String empname ;
	
	private String empdept;
	
	
	public void setEmpid(int eempid)
	{
	
		empid= eempid;

}
	
	public void setEmpname(String eempname)
	{
		empname = eempname;
	}
	
	public void setEmpdept(String eempdept)
	{
		empdept = eempdept;
	}

public int getEmpid()
{

return empid;
}

public String getEmpname()
{
	return empname;
}

public String getEmpdept()
{

return empdept;
}
}