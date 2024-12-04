package MeineTestKlassen;

public class Datum
{
    private int tag;
    private int monat;

    public Datum(int tag, int monat)
    {
        if(checkmonat(monat) == true) this.monat = monat;
        else this.monat = 1;

        if(checktag(tag, this.monat) == true) this.tag = tag;
        else this.tag = 1;
    }

    public Datum(int tag)
    {
        if(checktag(tag, this.monat) == true) this.tag = tag;
        else this.tag = 1;

        this.monat = 1;
    }

    public Datum()
    {
        this.tag = 1;
        this.monat = 1;
    }

    public int gettag()
    {
        return this.tag;
    }

    public int getmonat()
    {
        return this.monat;
    }

    public void setmonat(int monat)
    {
        if(checkmonat(monat) == true) this.monat = monat;
        else this.monat = 1;
    }

    public void settag(int tag)
    {
        if(checktag(tag, this.monat) == true) this.tag = tag;
        else this.tag = 1;
    }

    private boolean checkmonat(int monat)
    {
        if(monat > 12 || monat < 0) return false;
        return true;
    }

    public String toString()
    {
        return "Tag: " + this.tag + " Monat: " + this.monat;
    }

    private boolean checktag(int tag, int monat)
    {
        if(monat%2 == 0)
        {
            if(monat == 2 && (tag < 0 || tag > 29)) return false;
            if(tag < 0 || tag > 30) return false;
        }
        else
        {
            if(tag < 0 || tag > 31) return false;
        }
        return true;
    }
}