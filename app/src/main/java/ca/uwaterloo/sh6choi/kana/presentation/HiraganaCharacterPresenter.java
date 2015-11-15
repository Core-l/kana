package ca.uwaterloo.sh6choi.kana.presentation;

import android.content.Context;

import java.util.List;

import ca.uwaterloo.sh6choi.kana.database.DatabaseRequestCallback;
import ca.uwaterloo.sh6choi.kana.database.HiraganaCharacterDataSource;
import ca.uwaterloo.sh6choi.kana.database.KatakanaCharacterDataSource;
import ca.uwaterloo.sh6choi.kana.model.KanaCharacter;

/**
 * Created by Samson on 2015-10-23.
 */
public class HiraganaCharacterPresenter extends KanaCharacterPresenter {

    public HiraganaCharacterPresenter(Context context, CharacterView view) {
        super(new HiraganaCharacterDataSource(context), view);
    }
}
