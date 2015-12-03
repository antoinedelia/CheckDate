package Model;

public class Traitement {
	
	private int annee, moisInt, jour, heure, minute, secondes;
	
	public Traitement()
	{
		annee = 0;
		moisInt = 0;
		jour = 0;
		heure = 0;
		minute = 0;
		secondes = 0;
	}
	
	/* Can't handle letters and commas */
	public boolean FormatDate(String anneeString, String moisString, String jourString, String heureString, String minuteString, String secondesString)
	{
		if(!anneeString.equals(""))
			this.annee = Integer.parseInt(anneeString);
		
		if(!moisString.equals(""))
			this.moisInt = Integer.parseInt(moisString);
		
		if(!jourString.equals(""))
		this.jour = Integer.parseInt(jourString);
		
		if(!heureString.equals(""))
		this.heure = Integer.parseInt(heureString);
		
		if(!minuteString.equals(""))
		this.minute = Integer.parseInt(minuteString);
		
		if(!secondesString.equals(""))
		this.secondes = Integer.parseInt(secondesString);
		
		
		
		boolean dateCorrect = false;
		if(annee >= 1000 && annee <= 9999)
		{
			if(moisInt >= 1 && moisInt <= 12)
			{
				if(jour >= 1 && jour <= 31)
				{
					if((jour == 31 && (moisInt == 1 || moisInt == 3 || moisInt == 5 || moisInt == 7 || moisInt == 8 || moisInt == 10 || moisInt ==12)) || (moisInt == 2 && jour <= 28) || (moisInt == 2 && jour == 29 && ((annee%4==0 && annee%100!=0) || (annee%400==0))) || (jour < 29))
					{
						if(heure >= 0 && heure <=23)
						{
							if(minute >= 0 && minute <=59)
							{
								if(secondes >=0 && secondes <=59)
								{
									dateCorrect = true;
								}
							}
						}
					}
				}
			}
			
		}
		return dateCorrect;
	}
	
	

}
