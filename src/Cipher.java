/**
 * 
 * @author Hady Diab, Period 5 odd days, Cipher
 *
 */
public class Cipher {

	public static void main(String[] args) 
	{
		char letter= 'z';
		int letterAsANumber = letter- 'a';
		System.out.print(letterAsANumber);
		//prints four because A is 0. a=97, e=101, 101-97= 4. (ADDING and subtracting numerical values)
		//26 letters in alphabet, 0-25(indicies)
		//System.out.print((char) letterAsANumber);
		//letter as a number casted to character
		//System.out.print((char) 101);
		//take int cast to char.
		//askey character list
		//for this project:
		int newNumber= letterAsANumber+4; //shift alphabet up 4.
		char newLetter= (char) (newNumber + 'a'); //cast as a character
		
		System.out.print((char) (letterAsANumber+ 'a')); //we should get e, your taking 4+'a'(97)
		System.out.print("\n" + newLetter);
		//trickier part:
		int newLetter2= letter +4;
		System.out.print("\n"+(char) newLetter2); //these would also give u i
		//if u do this(letter+4), then your gonna go past random characters and symbols!
		
		//use modular division. 
		//mod by 26.
		//1 mod 10 is 1
		
		
		
		

	}

}
