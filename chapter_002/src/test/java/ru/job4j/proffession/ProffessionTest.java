package ru.job4j.proffession;

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
public class ProffessionTest {
	/**
	* Test Doctor.
	*/
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Doctor doc = new Doctor("Vasia", 12);
        String result = doc.treatPatient("Stepa");
        String expected = "Doctor Vasia heal Stepa";
        assertThat(result, is(expected));
    }
}
