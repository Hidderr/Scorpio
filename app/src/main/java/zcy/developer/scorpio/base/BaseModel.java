package zcy.developer.scorpio.base;

import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.MutableLiveData;

import zcy.developer.scorpio.App;

/**
 * @author zcy.
 * @date 2018/3/24.
 */
public class BaseModel extends AndroidViewModel {

    public BaseModel() {
        super(App.getInstance());
        MutableLiveData liveData = new MutableLiveData();
    }
}
