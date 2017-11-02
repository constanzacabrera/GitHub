//Constanza Cabrera
//10.27.2015

public class Employee
{
    private String name;
    private int idNumber;
    private String department;
    private String position;
    
    public Employee(String userInputName, int userInputIDNumber,
                    String userInputDepartment, String userInputPosition)
    {
        name = userInputName;
        idNumber = userInputIDNumber;
        department = userInputDepartment;
        position = userInputPosition;
    }
    public void setName(String userInputName)
    {
        name = userInputName;
    }
    public void setIDNumber(int userInputIDNumber)
    {
        idNumber = userInputIDNumber;
    }
    public void setDepartment(String userInputDepartment)
    {
        department = userInputDepartment;
    }
    public void setPosition(String userInputPosition)
    {
        position = userInputPosition;
    }
    public String getName(String name)
    {
        return name;
    }
    public int getIDNumber(int idNumber)
    {
        return idNumber;
    }
    public String getDepartment(String department)
    {
        return department;
    }
    public String getPosition(String position)
    {
        return position;
    }
}
