package org.example;

import java.util.ArrayList;
import java.util.List;

public class MusicLabel {
    private String name;
    private List<Musician> musicians;

    public MusicLabel(String name){
        this.name=name;
        musicians=new ArrayList<>();
    }

    public void addMusician(Musician m){
        musicians.add(m);
        System.out.println("Музыкант: "+m.getName()+" присоединился к лэйблу: "+name);
    }

    public Musician findMusician(String name) throws MusicianNotFoundException {
        for (Musician m : musicians) {
            if (m.getName().equalsIgnoreCase(name)) {
                return m;
            }
        }
        throw new MusicianNotFoundException("Музыкант с именем: " + name + " не найден в лейбле: " + name);
    }

    public void releaseAlbum(String name, String title){
        try{
            Musician musician = findMusician(name);
            musician.releaseAlbum(title);
        }
        catch (MusicianNotFoundException | InvalidMusicianDataException e){
            System.err.println("Ошибка при выпуске альбома: " + e.getMessage());
        }
    }


}
