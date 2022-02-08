package westjacob.sdsmt.puzzle_west_jacob;

//Tutorial 2 Grading
//
//        Complete the following checklist.
//
//
//        X 	10pt 	T2: Package is named correctly (not com.example.puzzle)
//
//        X	    10pt 	T2: The layout items are named correctly (grubbyImage, buttonStart, textWelcome)
//
//        X 	50pt	T2: Tutorial is completed
//
//        X 	15pt 	T2: TASK: Custom view covered entire screen
//
//        X 	15pt 	T2: TASK: Landscape task
//
//
//
//
//        The checklist is the starting point for course staff, who reserve the right to change the
//        grade if they disagree with your assessment and to deduct points for other issues they may
//        encounter, such as errors in the submission process, naming issues, etc.

//Tutorial 3 Grading
//
//        Complete the following checklist.
//
//
//        X 	55 	T3: Tutorial completed
//
//        X 	15 	T3: TASK: Pieces can be dragged around
//
//        X 	10 	T3: TASK: Snapped piece is on bottom
//
//        X 	10 	T3: TASK: Refreshes immediately after shuffle menu option
//
//        X 	10	T3: TASK: Refreshes immediately after dialog shuffle button
//
//        N/A  	10 	T3: CSC 576 ONLY: Displays solved version of the puzzle
//
//
//
//        The checklist is the starting point for course staff, who reserve the right to change the
//        grade if they disagree with your assessment and to deduct points for other issues they may
//        encounter, such as errors in the submission process, naming issues, etc.

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onStartPuzzle(View view) {
        Intent intent = new Intent(this, PuzzleActivity.class);
        startActivity(intent);
    }
}