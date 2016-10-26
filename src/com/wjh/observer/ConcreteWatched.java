package com.wjh.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * ����۲��ߣ�ConcreteObserver����ʵ�ֳ���۲��߽�ɫ��Ҫ��ĸ��½ӿڣ��Ա�ʹ�����״̬������״̬Э����
 * �������⣨ConcreteSubject�������й�״̬�������۲��߶����ھ��������ڲ�״̬�ı�ʱ�������е�
 * �ǹ��Ĺ۲��߷���֪ͨ��
 * @author WJH
 *
 */
public class ConcreteWatched implements Watched
{
    // ��Ź۲���
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
        // �Զ�����ʵ������������е��õ�
        for (Watcher watcher : list)
        {
            watcher.update(str);
        }
    }

}
