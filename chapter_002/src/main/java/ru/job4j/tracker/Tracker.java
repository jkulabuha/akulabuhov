package ru.job4j.tracker;
import java.util.Arrays;
/**
 *Class для хранения списка Item-ов и работы с ним.
 *@author akulabuhov
 *@since 20.08.2017
 *@version 1
 */
public class Tracker {
    /**
     *Массив заявок.
     */
    private Item[] items = new Item[100];
    /**
     *Указатель на номер элемента в массиве увеличивается при добавлении и у меньшается при удалении элемента в массиве.
     */
    private int flag = 0;
    /**
     *Номер элемента в массиве, для метода getNumb().
     */
    private int numb;
    /**
     * Метод добавляет элемент в массив.
     * @param item - элемент для добавления.
     * @return выводим получившийся массив.
     */
    public Item[] add(Item item) {
        if (flag < items.length) {
          items[flag] = item;
          flag++;
        }

        return items;
    }
    /**
     * Метод изменяет элемент массива новым(отредактированным).
     * @param item - элемент редактирования.
     */
    public void update(Item item) {
        for (Item i : items) {
            if (i.getId().equals(item.getId())) {
                items[getNumb(i.getId())] = item;
                break;
            }
        }
    }
    /**
     * Метод удаляет элемент массива.
     * @param item - элемент который нужно удалить.
     */
    public void delete(Item item) {
        Item[] delArray = items.clone();
        if (getNumb(item.getId()) == items.length - 1) {
            delArray[items.length] = null;
        } else {
            System.arraycopy(items, getNumb(item.getId()) + 1, delArray, getNumb(item.getId()), items.length - getNumb(item.getId()) - 1);
        }
        flag--;
        items = delArray;
    }
    /**
     * Метод возвращает массив элементов без незанятых ячеек элементов.
     * @return выводим получившийся массив.
     */
    public Item[] findAll() {
         return Arrays.copyOf(items, flag);
    }
    /**
     * Метод ищет элементы в массив с требуемым именем.
     * @param key - искомое имя.
     * @return выводим получившийся массив искомых значений.
     */
    public Item[] findByName(String key) {

        Item[] result = new Item[items.length];
        int a = 0;
        for (int i = 0; i < flag; i++) {
            if (items[i].getName().equals(key)) {
                result[a] = items[i];
                a++;
            }
        }
        return Arrays.copyOf(result, a);
    }
    /**
     * Метод ищет элемент в массив с требуемым значением id.
     * @param id - искомое id.
     * @return выводим найденный элемент массива.
     */
    public Item findById(String id) {

        Item result = null;
        for (Item it : items) {
            if (it.getId().equals(id)) {
                result = it;
                break;
            }
        }
        return result;
    }
    /**
     * Метод выводит номер элемента массива по его уникальному значению id.
     * @param id - id элемента номер ячейки которого нужно вывести.
     * @return выводим номер ячейки.
     */
    private int getNumb(String id) {

        for (int i = 0; i <= flag; i++) {
            if (id.equals(items[i].getId())) {
                numb = i;
                break;
            }
        }
        return numb;
    }
}
