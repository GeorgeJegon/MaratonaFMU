public class QuestaoPecaPerdida {
	private int totalPecas, pecaPerdida = 0;
	private String pecasText = new String();
	
	public void setTeste(int n, String str){
		this.totalPecas = n;
		this.pecasText = str;
	}//END FUNCTION
	
	public int getResult(){
		if(this.totalPecas>0){
			for(int i=new Integer(1);i<=this.totalPecas;i++){
				if(!this.pecasText.contains(""+i+"")){
					this.pecaPerdida = i;
					return this.pecaPerdida;
				}//END IF
			}//END FOR
		}//END IF
		return this.pecaPerdida;
	}//END FUNCTION
	
}//END CLASS
