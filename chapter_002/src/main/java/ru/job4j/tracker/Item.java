package ru.job4j.tracker;
import java.util.Arrays;
/**
 *Class для создание заявки - Item.
 *@author akulabuhov
 *@since 20.08.2017
 *@version 1
 */
public class Item {
    /**
     *Идентификатор, название заявки, описание заявки.
     */
    private String id, name, desc;
    /**
     *Дата создания заявки.
     */
    private long created;
    /**
     *Массив комментариев.
     */
    private String[] comments = new String[1];
    /**
     *Указатель ячейки массива(для комментариев).
     */
    private int flag = 1;
    /**
     * сеттер.
     * @param id идентификатор.
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * сеттер.
     * @param name имя.
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * сеттер.
     * @param desc описание.
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }
    /**
     * сеттер.
     * @param date дата.
     */
    public void setCreated(long date) {
        this.created = date;
    }
    /**
     * сеттер.
     * @param comment комментарий.
     */
    public void setComments(String comment) {
        String[] result = Arrays.copyOf(comments, flag);
        result[flag - 1] = comment;
        comments = result;
    }
    /**
     * геттер id.
     * @return id.
     */
    public String getId() {
        return id;
    }
    /**
     * геттер имени.
     * @return имя.
     */
    public String getName() {
        return name;
    }
    /**
     * геттер описания.
     * @return описание.
     */
    public String getDesc() {
        return desc;
    }
    /**
     * геттер даты создания.
     * @return дата.
     */
    public long getCreated() {
        return created;
    }
    /**
     * геттер комментариев.
     * @return массив комментариев.
     */
    public String[] getComments() {
        return comments;
    }
    /**
     * Конструктор класса.
     * @param id id.
     * @param name имя.
     * @param desc описание.
     * @param created дата создания.
     * @param comment комментарий.
     */
    Item(String id, String name, String desc, long created, String comment) {
        setId(id);
        setName(name);
        setDesc(desc);
        setCreated(created);
        setComments(comment);
    }
}
