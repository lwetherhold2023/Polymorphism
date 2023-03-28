public class Contact implements Comparable {
    private String firstName, lastName, phone;
    //-----------------------------------------------------------------
// Constructor: Sets up this contact with the specified data.
//-----------------------------------------------------------------
    public Contact(String first, String last, String telephone)
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
        return (phone.equals(((Contact)other).getPhone()));
    }
    //-----------------------------------------------------------------
// Uses phone numbers to determine ordering.
//-----------------------------------------------------------------
    public int compareTo(Object other)
    {
        int result;
        String otherPhone = ((Contact)other).getPhone();
        result = phone.compareTo(otherPhone);
        return result;
    }
    //-----------------------------------------------------------------
// Phone number accessor.
//-----------------------------------------------------------------
    public String getPhone()
    {
        return phone;
    }
}
