package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
	/**
	*Test.
	*
	*@author akulabuhov (mailto:jkulabuha@yandex.ru)
	*@version $ld$
	*@since 0.1
	*/
public class TrackerTest {
	/**
	* Test add(), findById().
	*/
	@Test
	public void whenAddNewItemThenTrackerHasSameItem() {
		Tracker tracker = new Tracker();
		Item item = new Item("test1", "testDescription", "testdesc", 123L, "Hello World!");
		tracker.add(item);
		assertThat(tracker.findById("test1").getId(), is(item.getId()));
	}
	/**
    * Test delete(), findByName().
    */
    @Test
	public void whenDelete() {
    Tracker tracker = new Tracker();
    Item item = new Item("test1", "testDescription", "testdesc", 123L, "Hello World!");
    Item item2 = new Item("test2", "testDescription", "testdesc", 123L, "Hello World!");
    tracker.add(item);
    tracker.add(item2);
    tracker.delete(item2);
    assertThat(tracker.findByName("testDescription").length, is(1));
        }

    /**
    * Test update().
    */
    @Test
	public void whenUpdate() {
            Tracker tracker = new Tracker();
            Item item = new Item("test1", "testDescription", "testdesc", 123L, "Hello World!");
            tracker.add(item);
            tracker.update(new Item("test1", "test2", "testdesc", 123L, "Hello World!"));
            assertThat(tracker.findById("test1").getName(), is("test2"));
        }

        /**
         * Test findAll().
         */

    @Test
    public void whenFindAll() {
    Tracker tracker = new Tracker();
    Item item = new Item("test1", "testDescription", "testdesc", 123L, "Hello World!");
    Item item2 = new Item("test2", "testDescription", "testdesc", 123L, "Hello World!");
    tracker.add(item);
    tracker.add(item2);
    assertThat(tracker.findAll().length, is(2));
    }

}
