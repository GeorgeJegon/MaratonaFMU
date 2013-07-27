public class QuestaoProjetoGenoma {
	private String cadeiaP = new String(), cadeiaT = new String();
	private int tamanhoCadeiaP = 0, tamanhoCadeiaT = 0;
	
	public void setTamanhoCadeias(int p, int t){
		this.tamanhoCadeiaP = p;
		this.tamanhoCadeiaT = t;
	}//END FUNCTION
	
	public void setCadeiaP(String p){
		this.cadeiaP = p;
	}//END FUNCTION
	
	public void setCadeiaT(String t){
		this.cadeiaT = t;
	}//END FUNCTION
	
	public String getResult(){
		String auxStr, returnValue = new String();
		auxStr = this.inverseLetters(this.cadeiaP);
		returnValue  = "ocorrencia direta: "+this.getOccurences(this.cadeiaP,this.cadeiaT);
		returnValue += "\nocorrencia complementar invertida: "+this.getOccurences(auxStr,this.cadeiaT);
		return returnValue;
	}//END FUNCTION
	
	private String getOccurences(String p, String t){
		String c = new String(), returnValue = new String();
		int lenP = this.tamanhoCadeiaP, lenT = this.tamanhoCadeiaT;
		if(lenP>0 && lenT>0 && lenT>=lenP){
			for(int i=0,j=(lenT-lenP);i<=j;i++){
				c = t.substring(i,i+lenP);
				if(c.equalsIgnoreCase(p)){
					returnValue+= (i+1)+" ";
				}//END IF
			}//END FOR
		}//END IF
		return (returnValue.length()>0)?returnValue:"0";
	}//END FUNCTION
	
	private String inverseLetters(String str){
		String returnValue = new String(), c = new String();
		if(str.length()>0){
			for(int i=0;i<str.length();i++){
				c = str.substring(i,i+1);
				if(c.equalsIgnoreCase("A")){
					returnValue+="T";
				}//END IF
				if(c.equalsIgnoreCase("T")){
					returnValue+="A";
				}//END IF
				if(c.equalsIgnoreCase("C")){
					returnValue+="G";
				}//END IF
				if(c.equalsIgnoreCase("G")){
					returnValue+="C";
				}//END IF
			}//END FOR
		}//END IF
		return this.inverseLettersOrder(returnValue); 
	}//END FUNCTION
	
	private String inverseLettersOrder(String str){
		String returnValue = new String();
		if(str.length()>0){
			for(int i=str.length();i>0;i--){
				returnValue+= str.substring(i-1,i);
			}//END FOR
		}//END IF
		return returnValue;
	}//END FUNCTION
	
	
}//END CLASS
