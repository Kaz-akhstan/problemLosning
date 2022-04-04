import java.util.Arrays;

public class stringsClass {
    public String reverse(String r)
    {
        char[] newR = new char[r.length()];
        String s = "";
        for (int i = 0; i < r.length(); i++)
        {
            newR[i] = r.charAt(r.length()-i-1);
            s+=newR[i];
        }
        return s;
    }
    public String camelCase(String c)
    {
        char[] cC = new char[c.length()];
        String s = "";
        boolean upNext = false;
        for (int i = 0; i < c.length(); i++)
        {
            if(c.charAt(i) == ' ')
            {
                upNext = true;
            }
            else if(upNext)
            {
                cC[i] = c.toUpperCase().charAt(i);
                upNext = false;
                s+=cC[i];
            }
            else
            {
                cC[i] = c.toLowerCase().charAt(i);
                s+=cC[i];
            }
        }
        return s;
    }
    public String palindrom(String p)
    {
        String q = reverse(p);
        for (int i = 0; i < p.length(); i++) {
            if(q.charAt(i) != p.charAt(i))
            {
                return "Ej Palindrom";
            }
        }
        return "Palindrom";
    }
}
