package assignment;

public class StringConverter {
	char[] _alphabets = {
			'a', 'b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'
	}; 
	public String NumberToString(int number)
	{
		String toReturn = "";
		String _array = Integer.toString(number);
		int _l = _array.length();
		for (int i=_array.length()-1; i >= 0 ; i--)
		{
			String _newAlphabet = "";
			if(_array.length() > 1)
			{
				if((i-1) > 0)
				{
					_newAlphabet = _array.charAt(i-1) + "" +_array.charAt(i);
					 int _code = Integer.parseInt(_newAlphabet);
					 if(_code > _alphabets.length)
					 {
						 _newAlphabet = _array.charAt(i) + "";
					 }
					 else
					 {
						 i -= 1;
					 }
				}
				else
				{
					_newAlphabet = _array.charAt(i) + "";
				}
				 
			}
			else
			{
				_newAlphabet = _array;
			}
			if(Integer.parseInt(_newAlphabet) > 0)
			{
				toReturn = (_alphabets[Integer.parseInt(_newAlphabet) - 1]) + toReturn;
			}
			
		}
		return toReturn;
	}
}
