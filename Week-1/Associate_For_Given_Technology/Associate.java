package Associate_For_Given_Technology;

public class Associate {
	
	private int id;
	private String name,technology;
	private int experienceInYears;
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public void setExperienceInYears(int experienceInYears)
	{
		this.experienceInYears=experienceInYears;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setTechnology(String technology)
	{
		this.technology=technology;
	}
	
	public int getId()
	{
		return id;
	}
	
	public int getExperienceInYears()
	{
		return experienceInYears;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getTechnology()
	{
		return technology;
	}

}
