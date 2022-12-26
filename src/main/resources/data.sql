INSERT INTO Genre(name)
VALUES
	('Action'),
    ('Adventure'),
    ('Drama'),
    ('Fantasy'),
    ('Comedy');

SELECT * FROM Genre;

INSERT INTO Anime(name, description)
VALUES
	('Fullmetal Alchemist: Brotherhood', 
		'As Edward becomes an infamous alchemist and gains the nickname "Fullmetal," the boys\' journey embroils them in a growing conspiracy that threatens the fate of the world.'),
    ('Bleach: Sennen Kessen-hen',
		'In retaliation, Ichigo and his friends must fight alongside old allies and enemies alike to end Yhwach\'s campaign of carnage before the world itself comes to an end.'),
    ('Kaguya-sama wa Kokurasetai: Ultra Romantic',
		'As love further blooms at Shuchiin Academy, the student council officers drag their outsider friends into increasingly comedic conflicts.'),
    ('Steins;Gate',
		'Due to the novel discovery, Rintarou and his friends find themselves in an ever-present danger. As he works to mitigate the damage his invention has caused to the timeline, he is not only fighting a battle to save his loved ones, but also one against his degrading sanity.'),
    ('Gintama°',
		'Filled with tongue-in-cheek humor and moments of heartfelt emotion, Gintama\'s fourth season finds Gintoki and his friends facing both their most hilarious misadventures and most dangerous crises yet.');

SELECT * FROM Anime;

INSERT INTO AnimeGenre(AnimeID, GenreID)
VALUES
	(1, 1),
    (1, 2),
    (1, 3);

-- SELECT Anime FROM AnimeGenre INNER JOIN Anime WHERE AnimeGenre.AnimeID = Anime.AnimeID;