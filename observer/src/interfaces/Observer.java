package interfaces;

public interface Observer {

    /**
     * 事件源变化时调用更新
     * @param d data
     */
    void update(Data d);

}
