
public class QuestaoTelefone {
	private String _telefone = new String();
	
	public void setTelefone(String tel){
		this._telefone = tel;
	}//END FUNCTION
	
	public String getTelefone(){
		return this._telefone;
	}//END FUNCTION
	
	public String getResult(){
		String _returnValue = new String();
		_returnValue = this._telefone;
		_returnValue = _returnValue.replaceAll("(A|a|B|b|C|c)", "2");
		_returnValue = _returnValue.replaceAll("(D|d|E|e|F|f)", "3");
		_returnValue = _returnValue.replaceAll("(G|g|H|h|I|i)", "4");
		_returnValue = _returnValue.replaceAll("(J|j|K|k|L|l)", "5");
		_returnValue = _returnValue.replaceAll("(M|m|N|n|O|o)", "6");
		_returnValue = _returnValue.replaceAll("(P|p|Q|q|R|r|S|s)", "7");
		_returnValue = _returnValue.replaceAll("(T|t|U|u|V|v)", "8");
		_returnValue = _returnValue.replaceAll("(W|w|X|x|Y|y|Z|z)", "9");
		return _returnValue;
	}//END FUNCTION
}//END CLASS
