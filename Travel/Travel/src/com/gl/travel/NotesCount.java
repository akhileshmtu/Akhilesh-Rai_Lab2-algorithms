package com.gl.travel;

public class NotesCount {
	public static void numberOfDenomination(int notes[], int amount)
	{
		int[] notesCounter = new int[notes.length];
		 {
			for (int i=0; i<notes.length; i++)
			{
				if (amount  >=notes[i]) {
					notesCounter[i]=amount/notes[i];
					
				}
			}
			
			if (amount> 0) {
				System.out.println("Exact Amount can not be given with highest dinomination");
			}
			else {
				System.out.println("Your Payment Approch inorder to give minimum number of notes");
				for (int i=0; i<notesCounter.length; i++)
					if (notesCounter[i]!=0)
						System.out.println(notes[i]+ " : "+notesCounter);
		
			}
		}
		
	}

}	

