package dao;
/*
 *  with the cipher code class
 */
public class CodeMOCK 
{
	private String[] codeList = null;
	public CodeMOCK()
	{
		codeList = new String[]{
				"RMuiRdf01160141151156164",
				"lims8r3860lims1631411561441",
				"GZQRyr6870GZQR+0041431501451451631455A",
				"qkMfPjrd0561411551551651561511641511571567",
		        "EOcTkerf3891511431450551431621451411550"};
	}
	
	public void printMock()
	{
		for(String code:codeList)
		{
			System.out.println(code);
		}
	}
	public String[] getCodeList() {
		return codeList;
	}
	public void setCodeList(String[] codeList) {
		this.codeList = codeList;
	}
	
}
