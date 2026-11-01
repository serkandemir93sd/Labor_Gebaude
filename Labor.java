public class Labor
{
    private String gebaude;
    private int stock;
    private boolean beamer;
    private int anzPlatze;
    
    public Labor()
    {
        setGebaude("Gemeinde");
        setStock(4);
        setBeamer(true);
        setAnzPlatze(7);
        
    }
    
    public Labor(String gebaude, int stock, boolean beamer, int anzPlatze)
    {
        setGebaude(gebaude);
        setStock(stock);
        setBeamer(beamer);
        setAnzPlatze(anzPlatze);
    }
    
    public void setGebaude(String gebaude)
    {
        this.gebaude = gebaude;
    }
    
    public void setStock(int stock)
    {
        this.stock = stock;
    }
    
    public void setBeamer(boolean beamer)
    {
        this.beamer = beamer;
    }
    
    public void setAnzPlatze(int anzPlatze)
    {
        this.anzPlatze = anzPlatze;
    }
    
    public String getGebaude()
    {
       return gebaude; 
    }
    
    public int getStock()
    {
        return stock;
    }
    
    public boolean getBeamer()
    {
        return beamer;
    }
    
    public int getAnzPlatze()
    {
        return anzPlatze;
    }
    
    public void printLabor()
    {
        System.out.println("Gebaude:\t" + stock + "\t" + beamer + "\t" + anzPlatze );
    }
}
