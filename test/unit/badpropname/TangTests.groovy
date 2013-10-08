package badpropname



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Tang)
class TangTests {
	void testSomething() {
		assertNotNull(new Tang().save())
	}
}
