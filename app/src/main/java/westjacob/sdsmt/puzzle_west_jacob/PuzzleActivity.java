package westjacob.sdsmt.puzzle_west_jacob;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class PuzzleActivity extends AppCompatActivity {

    /**
     * The puzzle view in this activity's view
     */
    private PuzzleView puzzleView;

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_puzzle);

        puzzleView = (PuzzleView)this.findViewById(R.id.puzzleView);

        if(bundle != null) {
            // We have saved state
            puzzleView.loadInstanceState(bundle);
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);

        puzzleView.saveInstanceState(bundle);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_puzzle, menu);
        return true;

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_shuffle:
                puzzleView.getPuzzle().shuffle();
                puzzleView.invalidate();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}