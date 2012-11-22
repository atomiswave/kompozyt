
public interface Pracownik {
	public void dodaj(Pracownik pracownik);
	public void wywal(Pracownik pracownik);
	public Pracownik potomek(int i);
	public String getImie();
	public double getHajs();
	public void wypisz();
}
