package fourth_project;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		String[] oldStrArray= {"Java","Python","C++"};	
		String[] newStrArray= new String[5];												
			
		//아래.System.arraycopy(원본배열,시작인댁스,복사할배열,복사 시작할인댁스,복사할개수);
		System.arraycopy(oldStrArray, 0, newStrArray, 0,oldStrArray.length);	
	
		//아래 식들은 콤마 빼고 넣고 하는방법.,
	for(int i=0;i<newStrArray.length;i++) {	
		if(i == newStrArray.length-1) {	
			System.out.println(newStrArray[i]);
		}else {	
			System.out.println(newStrArray[i]+",");
		}
		
	
	}

	}

}

	





