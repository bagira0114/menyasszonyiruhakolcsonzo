CREATE TABLE ugyfel (
UgyfelId INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
Vezeteknev VARCHAR(50) NOT NULL,
Keresztnev VARCHAR(50) NOT NULL,
EmailCim VARCHAR(50) NOT NULL
);
ALTER TABLE ugyfel ADD UNIQUE (EmailCim);

CREATE TABLE menyasszonyiruha (
MenyasszonyiRuhaId INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
Leiras VARCHAR(255),
Kep VARCHAR(255),
Meret INT NOT NULL,
Ar INT NOT NULL,
Fazon ENUM('sellő','félsellő','hercegnős') CHARACTER SET utf8 COLLATE utf8_hungarian_ci NOT NULL,
Allapot ENUM('kölcsönözhető','kölcsönözve','tisztító','sérült') CHARACTER SET utf8 COLLATE utf8_hungarian_ci NOT NULL,
Megjegyzes VARCHAR(50)
);

CREATE TABLE fatyol (
FatyolId INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
Kep VARCHAR(255),
Ar INT NOT NULL,
Fazon ENUM('rövid', 'hosszú', 'pironkodó')  CHARACTER SET utf8 COLLATE utf8_hungarian_ci NOT NULL,
Allapot ENUM('kölcsönözhető','kölcsönözve','tisztító','sérült')  CHARACTER SET utf8 COLLATE utf8_hungarian_ci NOT NULL,
Megjegyzes VARCHAR(255)
);

CREATE TABLE kesztyu (
Kesztyuid INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
Kep VARCHAR(255),
Ar INT NOT NULL,
Allapot ENUM('kölcsönözhető','kölcsönözve','tisztító','sérült') CHARACTER SET utf8 COLLATE utf8_hungarian_ci NOT NULL,
Megjegyzes VARCHAR(255)
);

CREATE TABLE kolcsonzes (
KolcsonzesId INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
Allapot ENUM('kölcsönözhető','kölcsönözve','tisztító','sérült') CHARACTER SET utf8 COLLATE utf8_hungarian_ci NOT NULL,
KolcsonzesEleje DATE NOT NULL,
Hatarido DATE NOT NULL,
VisszahozatalDatuma DATE ,
Megjegyzes VARCHAR(255),
MenyasszonyiRuhaId INT,
FatyolId INT,
Kesztyuid INT,
UgyfelId INT NOT NULL,
FOREIGN KEY (MenyasszonyiRuhaId) REFERENCES menyasszonyiruha(MenyasszonyiRuhaId),
FOREIGN KEY (FatyolId) REFERENCES fatyol(FatyolId),
FOREIGN KEY (Kesztyuid) REFERENCES kesztyu(Kesztyuid),
FOREIGN KEY (UgyfelId) REFERENCES ugyfel(UgyfelId)

);

CREATE TABLE felhasznalo (
FelhasznaloId INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
Felhasznalonev VARCHAR(50) NOT NULL,
Jelszo VARCHAR(255) NOT NULL
);
INSERT INTO felhasznalo (Felhasznalonev, Jelszo) VALUES ('admin', 'kacsa');






