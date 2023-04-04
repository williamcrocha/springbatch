package br.com.williamrocha.importing.batch.person;

import br.com.williamrocha.importing.domain.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class PersonItemProcessor implements ItemProcessor<Person, Person>{
	
	private static final Logger logger = LoggerFactory.getLogger(PersonItemProcessor.class);

	/**
	 * Responsible to make any necessary change in object data before be writed on database
	 */
	@Override
	public Person process(Person person) throws Exception {
		if(!isValid(person)) {
			return null;
		}
		int id = person.getId();
		String name = person.getName();
		String cpf = person.getCpf();
		
		Person transformed = new Person(id,name,cpf);
		logger.info("Converting ( {} ) into ( {} )",person,transformed);
		
		return transformed;
	}

	/**
	 * Filtering records
	 * 
	 * @param person
	 * @return
	 */
	private boolean isValid(Person person) {
		if(Long.valueOf(person.getCpf()) % 2 > 0){
			return false;
		}
		return true;
	}
	
}
