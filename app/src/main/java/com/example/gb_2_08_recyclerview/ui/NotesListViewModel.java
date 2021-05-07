package com.example.gb_2_08_recyclerview.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.gb_2_08_recyclerview.domain.MockNotesRepository;
import com.example.gb_2_08_recyclerview.domain.Note;
import com.example.gb_2_08_recyclerview.domain.NotesRepository;

import java.util.List;

public class NotesListViewModel extends ViewModel {

    private final MutableLiveData<List<Note>> notesLiveData = new MutableLiveData<>();

    private NotesRepository repository = new MockNotesRepository();

    public LiveData<List<Note>> getNotesLiveData() {
        return notesLiveData;
    }

    public void requestNotes() {
        List<Note> notes = repository.getNotes();
        notesLiveData.setValue(notes);
    }
}
