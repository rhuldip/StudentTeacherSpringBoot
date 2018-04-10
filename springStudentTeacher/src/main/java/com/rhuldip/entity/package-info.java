/**
 * 
 */
/**
 * @author deepmacpro
 *
 */
package com.rhuldip.entity;
/*
	
	Id generation strategy
	AUTO: Hibernate selects the generation strategy based on the used dialect,For most of the db it is GenerationType.SEQUENCE
	
	IDENTITY: Hibernate relies on an auto-incremented database column to generate the primary key
			 This approach has a significant drawback if you use Hibernate. Hibernate requires a primary key value for
			 each managed entity and therefore has to perform the insert statement immediately. This prevents it from using
			  different optimization techniques like JDBC batching.
			  
	SEQUENCE: Hibernate requests the primary key value from a database sequence by calling a select operation
	
	TABLE: Hibernate uses a database table to simulate a sequence.
	
*/