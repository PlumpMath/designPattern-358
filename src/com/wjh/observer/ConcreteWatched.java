package com.wjh.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体观察者（ConcreteObserver）：实现抽象观察者角色所要求的更新接口，以便使本身的状态与主题状态协调。
 * 具体主题（ConcreteSubject）：将有关状态存入具体观察者对象；在具体主题内部状态改变时，给所有登
 * 记过的观察者发出通知。
 * @author WJH
 *
 */
public class ConcreteWatched implements Watched
{
    // 存放观察者
    private List<Watcher> list = new ArrayList<Watcher>();

    @Override
    public void addWatcher(Watcher watcher)
    {
        list.add(watcher);
    }

    @Override
    public void removeWatcher(Watcher watcher)
    {
        list.remove(watcher);
    }

    @Override
    public void notifyWatchers(String str)
    {
        // 自动调用实际上是主题进行调用的
        for (Watcher watcher : list)
        {
            watcher.update(str);
        }
    }

}
