class Solution
{
    public String compareNM(int n, int m)
    {
        if (n > m)
        {
            return "greater";
        }
        else if (n == m)
        {
            return "equal";
        }
        else
        {
            return "lesser";
        }
    }
}