public class ContactNames implements Comparable {
    private String firstName, lastName, phone;
    //-----------------------------------------------------------------
// Constructor: Sets up this contact with the specified data.
//-----------------------------------------------------------------
    public ContactNames(String first, String last, String telephone)
    {
        firstName = first;
        lastName = last;
        phone = telephone;
    }
    //-----------------------------------------------------------------
// Returns a description of this contact as a string.
//-----------------------------------------------------------------
    public String toString()
    {
        return lastName + ", " + firstName + "\t" + phone;
    }
    //-----------------------------------------------------------------
// Returns a description of this contact as a string.
//-----------------------------------------------------------------
    public boolean equals(Object other)
    {
        return (lastName.equals(((ContactNames)other).getLastName()) &&
                firstName.equals(((ContactNames)other).getFirstName()));
    }
    //-----------------------------------------------------------------
// Uses both last and first names to determine ordering.
//-----------------------------------------------------------------
    public int compareTo(Object other)
    {
        int result;
        String otherFirst = ((ContactNames)other).getFirstName();
        String otherLast = ((ContactNames)other).getLastName();
        if (lastName.equals(otherLast))
            result = firstName.compareTo(otherFirst);
        else
            result = lastName.compareTo(otherLast);
        return result;
    }
    //-----------------------------------------------------------------
// First name accessor.
//-----------------------------------------------------------------
    public String getFirstName()
    {
        return firstName;
    }
    //-----------------------------------------------------------------
// Last name accessor.
//-----------------------------------------------------------------
    public String getLastName()
    {
        return lastName;
    }
}
