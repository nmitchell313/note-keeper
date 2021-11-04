package edu.cnm.deepdive.notekeeper;

import android.app.Application;
import com.facebook.stetho.Stetho;
import edu.cnm.deepdive.notekeeper.service.NoteKeeperDatabase;

public class NoteKeeperApplication extends Application {

  public NoteKeeperApplication() {
    super();
  }

  @Override
  public void onCreate() {
    super.onCreate();
    Stetho.initializeWithDefaults(this);
    NoteKeeperDatabase.setContext(this);
  }
}
