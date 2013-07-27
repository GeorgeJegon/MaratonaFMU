public class QuestaoContaAgua {
	private int _qtdConsumo = 0;
	
	public void setQtdConsumo(int qtd){
		this._qtdConsumo = qtd;
	}//END FUNCTION
	
	public int getResult(){
		int returnValue = 7, c = this._qtdConsumo;
		int aux =0;
		if(c>11){
			aux = (c<30)?c:30;
			returnValue += ((aux-11)+1)*1;
		}//END IF
		if(c>31){
			aux = (c<100)?c:100;
			returnValue += ((aux-31)+1)*2;
		}//END IF
		if(c>101){
			returnValue += ((c-101)+1)*5;
		}//END IF
		return returnValue; 
	}//END FUNCTION
}//END CLASS
