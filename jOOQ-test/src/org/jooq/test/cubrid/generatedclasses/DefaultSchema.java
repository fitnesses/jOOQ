/**
 * This class is generated by jOOQ
 */
package org.jooq.test.cubrid.generatedclasses;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class DefaultSchema extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = -327919862;

	/**
	 * The singleton instance of <code></code>
	 */
	public static final DefaultSchema DEFAULT_SCHEMA = new DefaultSchema();

	/**
	 * No further instances allowed
	 */
	private DefaultSchema() {
		super("");
	}

	@Override
	public final java.util.List<org.jooq.Sequence<?>> getSequences() {
		return java.util.Arrays.<org.jooq.Sequence<?>>asList(
			org.jooq.test.cubrid.generatedclasses.Sequences.T_IDENTITY_PK_AI_ID,
			org.jooq.test.cubrid.generatedclasses.Sequences.T_IDENTITY_AI_ID,
			org.jooq.test.cubrid.generatedclasses.Sequences.T_TRIGGERS_AI_ID_GENERATED,
			org.jooq.test.cubrid.generatedclasses.Sequences.S_AUTHOR_ID);
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			org.jooq.test.cubrid.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE,
			org.jooq.test.cubrid.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST,
			org.jooq.test.cubrid.generatedclasses.tables.T_785.T_785,
			org.jooq.test.cubrid.generatedclasses.tables.T_959.T_959,
			org.jooq.test.cubrid.generatedclasses.tables.T_986_1.T_986_1,
			org.jooq.test.cubrid.generatedclasses.tables.T_986_2.T_986_2,
			org.jooq.test.cubrid.generatedclasses.tables.TAuthor.T_AUTHOR,
			org.jooq.test.cubrid.generatedclasses.tables.TBook.T_BOOK,
			org.jooq.test.cubrid.generatedclasses.tables.TBookStore.T_BOOK_STORE,
			org.jooq.test.cubrid.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE,
			org.jooq.test.cubrid.generatedclasses.tables.TBooleans.T_BOOLEANS,
			org.jooq.test.cubrid.generatedclasses.tables.TDates.T_DATES,
			org.jooq.test.cubrid.generatedclasses.tables.TDirectory.T_DIRECTORY,
			org.jooq.test.cubrid.generatedclasses.tables.TExoticTypes.T_EXOTIC_TYPES,
			org.jooq.test.cubrid.generatedclasses.tables.TIdentity.T_IDENTITY,
			org.jooq.test.cubrid.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK,
			org.jooq.test.cubrid.generatedclasses.tables.TLanguage.T_LANGUAGE,
			org.jooq.test.cubrid.generatedclasses.tables.TTriggers.T_TRIGGERS,
			org.jooq.test.cubrid.generatedclasses.tables.VAuthor.V_AUTHOR,
			org.jooq.test.cubrid.generatedclasses.tables.VBook.V_BOOK,
			org.jooq.test.cubrid.generatedclasses.tables.VLibrary.V_LIBRARY,
			org.jooq.test.cubrid.generatedclasses.tables.XTestCase_2025.X_TEST_CASE_2025,
			org.jooq.test.cubrid.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69,
			org.jooq.test.cubrid.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71,
			org.jooq.test.cubrid.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85,
			org.jooq.test.cubrid.generatedclasses.tables.XUnused.X_UNUSED);
	}
}
