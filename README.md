# VEZBA JAVA

## Napisati klasu avion

Avion ima mogućnost da:
- otvori vrata i zatvori vrata
- putnici uđi i izađu iz aviona
- utovari i istovari kofere
- natoči gorivo
- poleti i sleti
- putnici gledaju film



## USLOVI

1. Uslovi za poletanje aviona:
	- gorivo je natočeno makar 60%
		- ukoliko je tačno 60%, prilikom prvog sletanja ispisati obaveštenje da obavezno treba dopuniti gorivo.
	- svi koferi su utovareni (100 komada max)
	- vrata su zatvorena

2. Uslovi za film:
	- Avion je u letu

3. Uslovi za točenje goriva:
	- Avion je na zemlji

4. Uslovi za utovarivanje kofera:
	- Avion je na zemlji

5. Uslovi za gledanje filma:
	- Avion je u letu

6. Uslovi za sletanje aviona:
	- Film nije isključen





## POTREBNE METODE

	1. poletanje
		- avion ne može da poleti ako ima manje od 60% goriva
	
	2. sletanje

	3. točenje goriva (pokretanjem metoda, gorivo se dopunjuje za 25%)
	
	4. koferi
		- utovar kofera (pozivanjem metoda se utovaruje 50 kofera)
		- istovar kofera (pozivanjem metoda se istovaruje 100 kofera, a taj broj je ujedno i maksimalni broj kofera)
	
	5. otvaranje i zatvaranje vrata
	
	6. uključenje i isključenje filma
	
	7. proveru nivoa goriva za vreme leta (svakim pozivanjem metoda se gorivo u toku leta smanji za 25%)
		- kada je gorivo na nivou manjem od 30%, avion sleće
	
