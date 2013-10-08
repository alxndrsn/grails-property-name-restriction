package badpropname



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Ting)
class TingTests {
	void testSomething() {
		assertNotNull(new Ting().save())
	}
}

