
import javax.sound.midi.*;


public class MiniMiniMusicApp {   // this is the first one
       
     public static void main(String[] args) {
        MiniMiniMusicApp mini = new MiniMiniMusicApp();
        mini.play();
     }

    public void play() {

      try {

         // make (and open) a sequencer, make a sequence and track

         Sequencer sequencer = MidiSystem.getSequencer();         
         sequencer.open();
        
         Sequence seq = new Sequence(Sequence.PPQ, 4);
         Track track = seq.createTrack();     

         // now make two midi events (containing a midi message)
         MidiEvent event = null;
         
         // first make the message
         // then stick the message into a midi event 
         // and add the event to the track

          ShortMessage a = new ShortMessage();
          a.setMessage(144, 1, 44, 100);
          MidiEvent noteOn = new MidiEvent(a, 1); // <-- means at tick one, the above event happens
          track.add(noteOn);

          ShortMessage b = new ShortMessage();
          b.setMessage(130, 1, 120, 2);
          MidiEvent noteOff = new MidiEvent(b, 16); // <-- means at tick one, the above event happens
          track.add(noteOff);
         //  track.add(noteOn);
         //  track.add(noteOff);
         // add the events to the track
         ShortMessage c = new ShortMessage();
         c.setMessage(192, 1, 120, 10);
         MidiEvent noteTwo = new MidiEvent(c, 32); // <-- means at tick one, the above event happens
         track.add(noteTwo);

   

     
            
          // add the sequence to the sequencer, set timing, and start
          sequencer.setSequence(seq);
         
          sequencer.start();
          // new
          Thread.sleep(1000);
          sequencer.close();
          System.exit(0);
       } catch (Exception ex) {
          ex.printStackTrace();
            System.out.println("exception");
         }
  } // close play

} // close class