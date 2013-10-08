package badpropname



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Tong)
class TongTests {
	void testSomething() {
		assertNotNull(new Tong().save())
	}
}
