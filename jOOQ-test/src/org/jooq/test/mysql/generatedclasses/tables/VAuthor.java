/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
@java.lang.SuppressWarnings("all")
public class VAuthor extends org.jooq.impl.TableImpl<org.jooq.test.mysql.generatedclasses.tables.records.VAuthorRecord> {

	private static final long serialVersionUID = -1735856699;

	/**
	 * The singleton instance of <code>test.v_author</code>
	 */
	public static final org.jooq.test.mysql.generatedclasses.tables.VAuthor V_AUTHOR = new org.jooq.test.mysql.generatedclasses.tables.VAuthor();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql.generatedclasses.tables.records.VAuthorRecord> getRecordType() {
		return org.jooq.test.mysql.generatedclasses.tables.records.VAuthorRecord.class;
	}

	/**
	 * The column <code>test.v_author.ID</code>. The author ID
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.VAuthorRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, V_AUTHOR);

	/**
	 * The column <code>test.v_author.FIRST_NAME</code>. The author's first name
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.VAuthorRecord, java.lang.String> FIRST_NAME = createField("FIRST_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(50), V_AUTHOR);

	/**
	 * The column <code>test.v_author.LAST_NAME</code>. The author's last name
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.VAuthorRecord, java.lang.String> LAST_NAME = createField("LAST_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(50), V_AUTHOR);

	/**
	 * The column <code>test.v_author.DATE_OF_BIRTH</code>. The author's date of birth
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.VAuthorRecord, java.sql.Date> DATE_OF_BIRTH = createField("DATE_OF_BIRTH", org.jooq.impl.SQLDataType.DATE, V_AUTHOR);

	/**
	 * The column <code>test.v_author.YEAR_OF_BIRTH</code>. The author's year of birth
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.VAuthorRecord, java.lang.Integer> YEAR_OF_BIRTH = createField("YEAR_OF_BIRTH", org.jooq.impl.SQLDataType.INTEGER, V_AUTHOR);

	/**
	 * The column <code>test.v_author.ADDRESS</code>. The author's address
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.VAuthorRecord, java.lang.String> ADDRESS = createField("ADDRESS", org.jooq.impl.SQLDataType.VARCHAR.length(200), V_AUTHOR);

	/**
	 * No further instances allowed
	 */
	private VAuthor() {
		super("v_author", org.jooq.test.mysql.generatedclasses.Test.TEST);
	}
}
