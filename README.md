# EmailIdGenerator

To create an Email Id Generator (Codility challenge)

Two string is passed String S = "John Doe; Mary Jane; John Doe Paker; Mary Jane Watson-Parker; Mary Jane Parker; John Evan                                  Doe; John Ing Doe; Mary Kane Parker";
		     String C = "techm infosys wirecard check24 tipico infosys infosys tipico";

Based on the Person name and the company name, the Email ID should be generated in such a way that firstname.lastname@companyname.com.

If the person name is like John Doe & compamy name is Infosys then john.doe@infosys.com 
If the person name is like John Doe Paker & company name is Wirecard then john.paker@wirecard.com 
If the person name is like Mary Jane Watson-Parker and company name is check24 then mary.watsonpa@check24.com 
If the person name and company name is same like John Ing Doe and Infosys then john.doe1@infosys.com (numeric 1, 2 ...will be incremented)


The final output should be like below:
John Evan Doe<john.doe@infosys.com>John Doe Paker<john.paker@wirecard.com>John Doe<john.Doe@techm.com>Mary Jane Watson-Parker<mary.watsonpa@check24.com>Mary Kane Parker<mary.parker2@tipico.com>Mary Jane Parker<mary.parker@tipico.com>John Ing Doe<john.doe1@infosys.com>Mary Jane<mary.Jane@infosys.com>





