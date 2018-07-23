package mydemo.com.mydemo;

/**
 * Created by sahusun on 7/21/2018.
 */

public class Listdata
{
    private String title;

    private Rows[] rows;

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public Rows[] getRows ()
    {
        return rows;
    }

    public void setRows (Rows[] rows)
    {
        this.rows = rows;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [title = "+title+", rows = "+rows+"]";
    }
}

