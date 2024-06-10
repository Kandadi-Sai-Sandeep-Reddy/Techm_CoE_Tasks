package com.examples;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
//import org.junit.runner.ExtendWith;
//import org.junit.jupiter.MockitoExtension;

//@ExtendWith(MockitoExtension.class)
@RunWith(MockitoJUnitRunner.class)
public class AddRunner {
	
	//@InjectMocks
	//Addition addition;

	@Mock
	Addition mock= new Addition();

	@Test
	public void testAdd() {
		// Mock the behavior of the add method
		when(mock.add(10, 20)).thenReturn(30);

		// Verify that the mocked add method returns the expected value
		Assert.assertEquals(30, mock.add(10, 20));

		// Verify that the method was called
		verify(mock, times(1)).add(10, 20);

}
}
