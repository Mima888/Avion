
public class Avion {

    //Osnovni atributi
    int brojMesta = 100;
    int brojPutnika = 0;
    int kolicinaGoriva = 0;
    int kolicinaGorivaMax = 100;
    int brojKofera = 0;
    int brojKoferaMax = 100;

    // Kontrolne promenljive
    String vrataOk = "otvorena";
    boolean rezervoarOk = false;
    boolean koferiOk = false;
    boolean filmOk = false;
    boolean avionLeti = false;

    public Avion() {
    }

    public Avion(int mesta, int gorivo) {

        this.brojMesta = mesta;
        this.kolicinaGoriva = gorivo;
    }

    public int getBrojMesta() {
        return brojMesta;
    }

    public void setBrojMesta(int brojMesta) {
        this.brojMesta = brojMesta;
    }

    public int getBrojPutnika() {
        return brojPutnika;
    }

    public void setBrojPutnika(int brojPutnika) {
        this.brojPutnika = brojPutnika;
    }

    public int getKolicinaGoriva() {
        return kolicinaGoriva;
    }

    public void setKolicinaGoriva(int kolicinaGoriva) {
        this.kolicinaGoriva = kolicinaGoriva;
    }

    public int getBrojKofera() {
        return brojKofera;
    }

    public void setBrojKofera(int brojKofera) {
        this.brojKofera = brojKofera;
    }

    public int getBrojKoferaMax() {
        return brojKoferaMax;
    }

    public void setBrojKoferaMax(int brojKoferaMax) {
        this.brojKoferaMax = brojKoferaMax;
    }

    public String isVrataOk() {
        return vrataOk;
    }

    public void setVrataOk(String vrataOk) {
        this.vrataOk = vrataOk;
    }

    public boolean isRezervoarOk() {
        return rezervoarOk;
    }

    public void setRezervoarOk(boolean rezervoarOk) {
        this.rezervoarOk = rezervoarOk;
    }

    public boolean isKoferiOk() {
        return koferiOk;
    }

    public void setKoferiOk(boolean koferiOk) {
        this.koferiOk = koferiOk;
    }

    public boolean isFilmOk() {
        return filmOk;
    }

    public void setFilmOk(boolean filmOk) {
        this.filmOk = filmOk;
    }

    public boolean isAvionLeti() {
        return avionLeti;
    }

    public void setAvionLeti(boolean avionLeti) {
        this.avionLeti = avionLeti;
    }

    public void poletanje() {

        if (this.kolicinaGoriva > 60) {
            this.rezervoarOk = true;
        } else {
            if (this.kolicinaGoriva == 60) {
                this.rezervoarOk = true;
                System.out.println("Dopuniti gorivo prilikom prvog sletanja!");
            } else {
                this.rezervoarOk = false;
                System.out.println("Avion nema dovoljno goriva za poletanje!");
            }
        }

        if (this.rezervoarOk == true) {

            if (this.brojKofera <= this.brojKoferaMax) {

                if (this.vrataOk == "zatvorena") {

                    if (this.brojPutnika >= 1 && this.brojPutnika <= this.brojMesta) {

                        this.avionLeti = true;
                        System.out.println("Avion je poleteo. Srecan put!");
                    } else {

                        System.out.println("U avionu mora biti makar jedan putnik ili maksimalno " + this.brojMesta + " putnika");
                    }
                } else {

                    System.out.println("Morate zatvoriti vrata aviona!");
                }
            } else {

                System.out.println("Maksimalni broj kofera je: " + this.brojKoferaMax);
            }
        } else {

            System.out.println("Proverite nivo goriva");
        }
    }

    public void sletanje() {

        if (this.avionLeti == true) {

            iskljuciFilm();
            System.out.println("Avion slece, vezite pojaseve!");
            this.avionLeti = false;
        }
    }

    public void tocenjeGoriva() {
        if (this.avionLeti == false) {
            while (this.kolicinaGoriva < this.kolicinaGorivaMax) {
                this.kolicinaGoriva = this.kolicinaGoriva + 25;
                if (this.kolicinaGoriva > 100) {
                    int visak = this.kolicinaGoriva - this.kolicinaGorivaMax;
                    this.kolicinaGoriva = this.kolicinaGoriva - visak;
                }
                System.out.println("Tocenje goriva: [ " + this.kolicinaGoriva + " / " + this.kolicinaGorivaMax + " ]");
            }
        }
    }

    public void utovarKofera(int koferi) {

        if (this.avionLeti == false) {

            if (koferi <= this.brojKoferaMax) {

                this.brojKofera = koferi;
                System.out.println("Utovareno je: " + koferi + " kofera");
            } else {

                System.out.println("Max broj kofera je: " + this.brojKoferaMax + ", a vi ste poslali " + koferi);
                System.out.println("Utovarili smo max broj kofera, ostale kofere cemo poslati sledecim letom. Broj preostalih kofera je: " + (this.brojKoferaMax - koferi) * -1);
            }
        } else {

            System.out.println("Avion mora biti na zemlji!");
        }
    }

    public void istovarKofera() {

        if (this.avionLeti == false) {

            if (this.brojKofera > 0) {

                this.brojKofera = 0;
                System.out.println("Svi koferi su istovareni!");
            } else {

                System.out.println("U avionu nije bilo kofera!");
            }
        } else {

            System.out.println("Avion mora biti na zemlji!");
        }
    }

    public void otvaranjeVrata() {

        if (this.vrataOk == "zatvorena") {

            this.vrataOk = "otvorena";
            System.out.println("Vrata aviona su otvorena!");
        }
    }

    public void zatvaranjeVrata() {

        if (this.vrataOk == "otvorena") {

            this.vrataOk = "zatvorena";
            System.out.println("Vrata aviona su zatvorena!");
        }
    }

    public void ukljuciFilm() {

        if (avionLeti == true) {

            this.filmOk = true;
            System.out.println("Film je ukljucen!");
        } else {

            this.filmOk = false;
            System.out.println("Avion mora biti u letu");
        }
    }

    public void iskljuciFilm() {

        if (avionLeti == true) {

            this.filmOk = false;
            System.out.println("Film je iskljucen!");
        } else {

            System.out.println("Avion mora biti u letu!");
        }
    }

    public void proveraNivoaGoriva() {

        if (this.avionLeti == true) {
            this.kolicinaGoriva -= 25;
            System.out.println("Kolicina goriva nakon smanjenja je: " + this.kolicinaGoriva);

            if (this.kolicinaGoriva < 30) {

                System.out.println("UPOZORENJE: Stanje goriva je kriticno, neophodno je sletanje!");
            }
        }
    }
}
