package creational_dp.prototype.bt_prototype;

public class Client {
    public static void main(String[] args) {
        ProgrammeRegistry reg = new ProgrammeRegistry();
        Film film = new Film("The Frog", 2.0, EntertainmentType.Film);
        TVProgramme tvProgramme = new TVProgramme("Ai la Trieu Phu", 2.0, EntertainmentType.TVProgramme);
        MusicEvent musicEvent = new MusicEvent("Anh trai vuot ngan chong gai", 2.0, EntertainmentType.MusicEvent);

        //Show original programme
        film.showEntertainment();
        tvProgramme.showEntertainment();
        musicEvent.showEntertainment();

        //Clone
        Film clonedFilm = (Film) film.clone();
        clonedFilm.showEntertainment();

        TVProgramme clonedTvProgramme = (TVProgramme) tvProgramme.clone();
        clonedTvProgramme.showEntertainment();

        MusicEvent clonedMusicEvent = (MusicEvent) musicEvent.clone();
        clonedMusicEvent.showEntertainment();

        //Save in registry
        reg.registryProgramme(EntertainmentType.TVProgramme, clonedTvProgramme);
        reg.registryProgramme(EntertainmentType.Film, clonedFilm);
        reg.registryProgramme(EntertainmentType.MusicEvent, clonedMusicEvent);

        Programme filmInReg = reg.createProgramme(EntertainmentType.Film);
        Programme tvProgrammeInReg = reg.createProgramme(EntertainmentType.TVProgramme);
        Programme musicEventInReg = reg.createProgramme(EntertainmentType.MusicEvent);

        filmInReg.showEntertainment();
        tvProgrammeInReg.showEntertainment();
        musicEventInReg.showEntertainment();
    }
}
