package com.example.gb_2_08_recyclerview.domain;

import java.util.ArrayList;
import java.util.List;

public class MockNotesRepository implements NotesRepository {
    @Override
    public List<Note> getNotes() {
        ArrayList<Note> notes = new ArrayList<>();

        notes.add(new Note("id1", "Title Number One", "https://cdn.pixabay.com/photo/2020/12/25/11/57/flamingos-5859192_960_720.jpg"));
        notes.add(new Note("id2", "Title Number Two", "https://cdn.pixabay.com/photo/2020/05/05/16/54/wisteria-5133949_960_720.jpg"));
        notes.add(new Note("id3", "Title Number Three", "https://cdn.pixabay.com/photo/2020/04/17/16/48/marguerite-5056063_960_720.jpg"));
        notes.add(new Note("id4", "Title Number Four", "https://cdn.pixabay.com/photo/2020/06/22/10/40/castle-5328719_960_720.jpg"));
        notes.add(new Note("id5", "Title Number Five", "https://cdn.pixabay.com/photo/2021/03/17/09/06/snowdrop-6101818_960_720.jpg"));
        notes.add(new Note("id6", "Title Number Six", "https://cdn.pixabay.com/photo/2021/04/18/13/35/flowers-6188414_960_720.jpg"));
        notes.add(new Note("id7", "Title Number Seven", "https://cdn.pixabay.com/photo/2021/02/16/18/42/river-6021951_960_720.jpg"));
        notes.add(new Note("id8", "Title Number Eight", "https://cdn.pixabay.com/photo/2020/09/18/20/46/kosmeen-5582938_960_720.jpg"));
        notes.add(new Note("id9", "Title Number Nine", "https://cdn.pixabay.com/photo/2019/06/21/23/13/dispersal-4290533_960_720.jpg"));
        notes.add(new Note("id10", "Title Number Ten", "https://cdn.pixabay.com/photo/2021/04/17/08/14/woodpecker-6185247_960_720.jpg"));
        notes.add(new Note("id11", "Title Number Eleven", "https://cdn.pixabay.com/photo/2021/04/25/12/23/flowers-6206279_960_720.jpg"));
        notes.add(new Note("id12", "Title Number Twelve", "https://cdn.pixabay.com/photo/2020/09/02/16/07/lake-5538757_960_720.jpg"));

        return notes;
    }
}
