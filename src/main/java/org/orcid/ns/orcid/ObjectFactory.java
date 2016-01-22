/**
 * This file is part of huborcid.
 *
 * huborcid is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * huborcid is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with huborcid.  If not, see <http://www.gnu.org/licenses/>.
 */
//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2016.01.16 alle 12:48:36 PM CET 
//


package org.orcid.ns.orcid;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.orcid.ns.orcid package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SourceOrcid_QNAME = new QName("http://www.orcid.org/ns/orcid", "source-orcid");
    private final static QName _Locale_QNAME = new QName("http://www.orcid.org/ns/orcid", "locale");
    private final static QName _WorkType_QNAME = new QName("http://www.orcid.org/ns/orcid", "work-type");
    private final static QName _MessageVersion_QNAME = new QName("http://www.orcid.org/ns/orcid", "message-version");
    private final static QName _FundingContributorRole_QNAME = new QName("http://www.orcid.org/ns/orcid", "funding-contributor-role");
    private final static QName _SendMemberUpdateRequests_QNAME = new QName("http://www.orcid.org/ns/orcid", "send-member-update-requests");
    private final static QName _DisambiguatedOrganizationIdentifier_QNAME = new QName("http://www.orcid.org/ns/orcid", "disambiguated-organization-identifier");
    private final static QName _FundingType_QNAME = new QName("http://www.orcid.org/ns/orcid", "funding-type");
    private final static QName _SalesforceId_QNAME = new QName("http://www.orcid.org/ns/orcid", "salesforce-id");
    private final static QName _ContributorSequence_QNAME = new QName("http://www.orcid.org/ns/orcid", "contributor-sequence");
    private final static QName _SourceClientId_QNAME = new QName("http://www.orcid.org/ns/orcid", "source-client-id");
    private final static QName _DisambiguationSource_QNAME = new QName("http://www.orcid.org/ns/orcid", "disambiguation-source");
    private final static QName _ContributorOrcid_QNAME = new QName("http://www.orcid.org/ns/orcid", "contributor-orcid");
    private final static QName _Host_QNAME = new QName("http://www.orcid.org/ns/orcid", "host");
    private final static QName _Path_QNAME = new QName("http://www.orcid.org/ns/orcid", "path");
    private final static QName _WorkSource_QNAME = new QName("http://www.orcid.org/ns/orcid", "work-source");
    private final static QName _SendEmailFrequencyDays_QNAME = new QName("http://www.orcid.org/ns/orcid", "send-email-frequency-days");
    private final static QName _ShortDescription_QNAME = new QName("http://www.orcid.org/ns/orcid", "short-description");
    private final static QName _OrcidIdentifier_QNAME = new QName("http://www.orcid.org/ns/orcid", "orcid-identifier");
    private final static QName _WorkExternalIdentifierType_QNAME = new QName("http://www.orcid.org/ns/orcid", "work-external-identifier-type");
    private final static QName _FundingExternalIdentifierType_QNAME = new QName("http://www.orcid.org/ns/orcid", "funding-external-identifier-type");
    private final static QName _ApplicationOrcid_QNAME = new QName("http://www.orcid.org/ns/orcid", "application-orcid");
    private final static QName _OrganizationDefinedType_QNAME = new QName("http://www.orcid.org/ns/orcid", "organization-defined-type");
    private final static QName _WorkCitation_QNAME = new QName("http://www.orcid.org/ns/orcid", "work-citation");
    private final static QName _WorkExternalIdentifierId_QNAME = new QName("http://www.orcid.org/ns/orcid", "work-external-identifier-id");
    private final static QName _ContributorRole_QNAME = new QName("http://www.orcid.org/ns/orcid", "contributor-role");
    private final static QName _ClientIdUri_QNAME = new QName("http://www.orcid.org/ns/orcid", "uri");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.orcid.ns.orcid
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SecurityDetails }
     * 
     */
    public SecurityDetails createSecurityDetails() {
        return new SecurityDetails();
    }

    /**
     * Create an instance of {@link EncryptedPassword }
     * 
     */
    public EncryptedPassword createEncryptedPassword() {
        return new EncryptedPassword();
    }

    /**
     * Create an instance of {@link SecurityQuestionId }
     * 
     */
    public SecurityQuestionId createSecurityQuestionId() {
        return new SecurityQuestionId();
    }

    /**
     * Create an instance of {@link EncryptedSecurityAnswer }
     * 
     */
    public EncryptedSecurityAnswer createEncryptedSecurityAnswer() {
        return new EncryptedSecurityAnswer();
    }

    /**
     * Create an instance of {@link EncryptedVerificationCode }
     * 
     */
    public EncryptedVerificationCode createEncryptedVerificationCode() {
        return new EncryptedVerificationCode();
    }

    /**
     * Create an instance of {@link FundingContributorAttributes }
     * 
     */
    public FundingContributorAttributes createFundingContributorAttributes() {
        return new FundingContributorAttributes();
    }

    /**
     * Create an instance of {@link Year }
     * 
     */
    public Year createYear() {
        return new Year();
    }

    /**
     * Create an instance of {@link OrcidDeprecated }
     * 
     */
    public OrcidDeprecated createOrcidDeprecated() {
        return new OrcidDeprecated();
    }

    /**
     * Create an instance of {@link DeprecatedDate }
     * 
     */
    public DeprecatedDate createDeprecatedDate() {
        return new DeprecatedDate();
    }

    /**
     * Create an instance of {@link PrimaryRecord }
     * 
     */
    public PrimaryRecord createPrimaryRecord() {
        return new PrimaryRecord();
    }

    /**
     * Create an instance of {@link OrcidId }
     * 
     */
    public OrcidId createOrcidId() {
        return new OrcidId();
    }

    /**
     * Create an instance of {@link Claimed }
     * 
     */
    public Claimed createClaimed() {
        return new Claimed();
    }

    /**
     * Create an instance of {@link SourceReference }
     * 
     */
    public SourceReference createSourceReference() {
        return new SourceReference();
    }

    /**
     * Create an instance of {@link SourceDate }
     * 
     */
    public SourceDate createSourceDate() {
        return new SourceDate();
    }

    /**
     * Create an instance of {@link WorkExternalIdentifiers }
     * 
     */
    public WorkExternalIdentifiers createWorkExternalIdentifiers() {
        return new WorkExternalIdentifiers();
    }

    /**
     * Create an instance of {@link WorkExternalIdentifier }
     * 
     */
    public WorkExternalIdentifier createWorkExternalIdentifier() {
        return new WorkExternalIdentifier();
    }

    /**
     * Create an instance of {@link FundingContributors }
     * 
     */
    public FundingContributors createFundingContributors() {
        return new FundingContributors();
    }

    /**
     * Create an instance of {@link FundingContributor }
     * 
     */
    public FundingContributor createFundingContributor() {
        return new FundingContributor();
    }

    /**
     * Create an instance of {@link CreditName }
     * 
     */
    public CreditName createCreditName() {
        return new CreditName();
    }

    /**
     * Create an instance of {@link ContributorEmail }
     * 
     */
    public ContributorEmail createContributorEmail() {
        return new ContributorEmail();
    }

    /**
     * Create an instance of {@link OrcidWorks }
     * 
     */
    public OrcidWorks createOrcidWorks() {
        return new OrcidWorks();
    }

    /**
     * Create an instance of {@link OrcidWork }
     * 
     */
    public OrcidWork createOrcidWork() {
        return new OrcidWork();
    }

    /**
     * Create an instance of {@link WorkTitle }
     * 
     */
    public WorkTitle createWorkTitle() {
        return new WorkTitle();
    }

    /**
     * Create an instance of {@link Subtitle }
     * 
     */
    public Subtitle createSubtitle() {
        return new Subtitle();
    }

    /**
     * Create an instance of {@link TranslatedTitle }
     * 
     */
    public TranslatedTitle createTranslatedTitle() {
        return new TranslatedTitle();
    }

    /**
     * Create an instance of {@link StringWithLangCode }
     * 
     */
    public StringWithLangCode createStringWithLangCode() {
        return new StringWithLangCode();
    }

    /**
     * Create an instance of {@link JournalTitle }
     * 
     */
    public JournalTitle createJournalTitle() {
        return new JournalTitle();
    }

    /**
     * Create an instance of {@link Citation }
     * 
     */
    public Citation createCitation() {
        return new Citation();
    }

    /**
     * Create an instance of {@link PublicationDate }
     * 
     */
    public PublicationDate createPublicationDate() {
        return new PublicationDate();
    }

    /**
     * Create an instance of {@link FuzzyDate }
     * 
     */
    public FuzzyDate createFuzzyDate() {
        return new FuzzyDate();
    }

    /**
     * Create an instance of {@link Month }
     * 
     */
    public Month createMonth() {
        return new Month();
    }

    /**
     * Create an instance of {@link Day }
     * 
     */
    public Day createDay() {
        return new Day();
    }

    /**
     * Create an instance of {@link Url }
     * 
     */
    public Url createUrl() {
        return new Url();
    }

    /**
     * Create an instance of {@link WorkContributors }
     * 
     */
    public WorkContributors createWorkContributors() {
        return new WorkContributors();
    }

    /**
     * Create an instance of {@link Contributor }
     * 
     */
    public Contributor createContributor() {
        return new Contributor();
    }

    /**
     * Create an instance of {@link ContributorAttributes }
     * 
     */
    public ContributorAttributes createContributorAttributes() {
        return new ContributorAttributes();
    }

    /**
     * Create an instance of {@link Source }
     * 
     */
    public Source createSource() {
        return new Source();
    }

    /**
     * Create an instance of {@link ClientId }
     * 
     */
    public ClientId createClientId() {
        return new ClientId();
    }

    /**
     * Create an instance of {@link SourceName }
     * 
     */
    public SourceName createSourceName() {
        return new SourceName();
    }

    /**
     * Create an instance of {@link CreatedDate }
     * 
     */
    public CreatedDate createCreatedDate() {
        return new CreatedDate();
    }

    /**
     * Create an instance of {@link LastModifiedDate }
     * 
     */
    public LastModifiedDate createLastModifiedDate() {
        return new LastModifiedDate();
    }

    /**
     * Create an instance of {@link Country }
     * 
     */
    public Country createCountry() {
        return new Country();
    }

    /**
     * Create an instance of {@link ApplicationSummary }
     * 
     */
    public ApplicationSummary createApplicationSummary() {
        return new ApplicationSummary();
    }

    /**
     * Create an instance of {@link ApplicationName }
     * 
     */
    public ApplicationName createApplicationName() {
        return new ApplicationName();
    }

    /**
     * Create an instance of {@link ApplicationWebsite }
     * 
     */
    public ApplicationWebsite createApplicationWebsite() {
        return new ApplicationWebsite();
    }

    /**
     * Create an instance of {@link ApprovalDate }
     * 
     */
    public ApprovalDate createApprovalDate() {
        return new ApprovalDate();
    }

    /**
     * Create an instance of {@link ScopePaths }
     * 
     */
    public ScopePaths createScopePaths() {
        return new ScopePaths();
    }

    /**
     * Create an instance of {@link ScopePath }
     * 
     */
    public ScopePath createScopePath() {
        return new ScopePath();
    }

    /**
     * Create an instance of {@link ExternalIdReference }
     * 
     */
    public ExternalIdReference createExternalIdReference() {
        return new ExternalIdReference();
    }

    /**
     * Create an instance of {@link FundingExternalIdentifier }
     * 
     */
    public FundingExternalIdentifier createFundingExternalIdentifier() {
        return new FundingExternalIdentifier();
    }

    /**
     * Create an instance of {@link ActivitiesVisibilityDefault }
     * 
     */
    public ActivitiesVisibilityDefault createActivitiesVisibilityDefault() {
        return new ActivitiesVisibilityDefault();
    }

    /**
     * Create an instance of {@link FundingList }
     * 
     */
    public FundingList createFundingList() {
        return new FundingList();
    }

    /**
     * Create an instance of {@link Funding }
     * 
     */
    public Funding createFunding() {
        return new Funding();
    }

    /**
     * Create an instance of {@link FundingTitle }
     * 
     */
    public FundingTitle createFundingTitle() {
        return new FundingTitle();
    }

    /**
     * Create an instance of {@link Amount }
     * 
     */
    public Amount createAmount() {
        return new Amount();
    }

    /**
     * Create an instance of {@link FundingExternalIdentifiers }
     * 
     */
    public FundingExternalIdentifiers createFundingExternalIdentifiers() {
        return new FundingExternalIdentifiers();
    }

    /**
     * Create an instance of {@link Organization }
     * 
     */
    public Organization createOrganization() {
        return new Organization();
    }

    /**
     * Create an instance of {@link OrganizationAddress }
     * 
     */
    public OrganizationAddress createOrganizationAddress() {
        return new OrganizationAddress();
    }

    /**
     * Create an instance of {@link DisambiguatedOrganization }
     * 
     */
    public DisambiguatedOrganization createDisambiguatedOrganization() {
        return new DisambiguatedOrganization();
    }

    /**
     * Create an instance of {@link SendAdministrativeChangeNotifications }
     * 
     */
    public SendAdministrativeChangeNotifications createSendAdministrativeChangeNotifications() {
        return new SendAdministrativeChangeNotifications();
    }

    /**
     * Create an instance of {@link DelegateSummary }
     * 
     */
    public DelegateSummary createDelegateSummary() {
        return new DelegateSummary();
    }

    /**
     * Create an instance of {@link SendChangeNotifications }
     * 
     */
    public SendChangeNotifications createSendChangeNotifications() {
        return new SendChangeNotifications();
    }

    /**
     * Create an instance of {@link OrcidPreferences }
     * 
     */
    public OrcidPreferences createOrcidPreferences() {
        return new OrcidPreferences();
    }

    /**
     * Create an instance of {@link RelevancyScore }
     * 
     */
    public RelevancyScore createRelevancyScore() {
        return new RelevancyScore();
    }

    /**
     * Create an instance of {@link Email }
     * 
     */
    public Email createEmail() {
        return new Email();
    }

    /**
     * Create an instance of {@link SubmissionDate }
     * 
     */
    public SubmissionDate createSubmissionDate() {
        return new SubmissionDate();
    }

    /**
     * Create an instance of {@link Preferences }
     * 
     */
    public Preferences createPreferences() {
        return new Preferences();
    }

    /**
     * Create an instance of {@link SendOrcidNews }
     * 
     */
    public SendOrcidNews createSendOrcidNews() {
        return new SendOrcidNews();
    }

    /**
     * Create an instance of {@link DeveloperToolsEnabled }
     * 
     */
    public DeveloperToolsEnabled createDeveloperToolsEnabled() {
        return new DeveloperToolsEnabled();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Biography }
     * 
     */
    public Biography createBiography() {
        return new Biography();
    }

    /**
     * Create an instance of {@link DelegationDetails }
     * 
     */
    public DelegationDetails createDelegationDetails() {
        return new DelegationDetails();
    }

    /**
     * Create an instance of {@link ExternalIdUrl }
     * 
     */
    public ExternalIdUrl createExternalIdUrl() {
        return new ExternalIdUrl();
    }

    /**
     * Create an instance of {@link CompletionDate }
     * 
     */
    public CompletionDate createCompletionDate() {
        return new CompletionDate();
    }

    /**
     * Create an instance of {@link OrcidMessage }
     * 
     */
    public OrcidMessage createOrcidMessage() {
        return new OrcidMessage();
    }

    /**
     * Create an instance of {@link OrcidProfile }
     * 
     */
    public OrcidProfile createOrcidProfile() {
        return new OrcidProfile();
    }

    /**
     * Create an instance of {@link OrcidHistory }
     * 
     */
    public OrcidHistory createOrcidHistory() {
        return new OrcidHistory();
    }

    /**
     * Create an instance of {@link DeactivationDate }
     * 
     */
    public DeactivationDate createDeactivationDate() {
        return new DeactivationDate();
    }

    /**
     * Create an instance of {@link OrcidBio }
     * 
     */
    public OrcidBio createOrcidBio() {
        return new OrcidBio();
    }

    /**
     * Create an instance of {@link PersonalDetails }
     * 
     */
    public PersonalDetails createPersonalDetails() {
        return new PersonalDetails();
    }

    /**
     * Create an instance of {@link OtherNames }
     * 
     */
    public OtherNames createOtherNames() {
        return new OtherNames();
    }

    /**
     * Create an instance of {@link ResearcherUrls }
     * 
     */
    public ResearcherUrls createResearcherUrls() {
        return new ResearcherUrls();
    }

    /**
     * Create an instance of {@link ResearcherUrl }
     * 
     */
    public ResearcherUrl createResearcherUrl() {
        return new ResearcherUrl();
    }

    /**
     * Create an instance of {@link ContactDetails }
     * 
     */
    public ContactDetails createContactDetails() {
        return new ContactDetails();
    }

    /**
     * Create an instance of {@link Keywords }
     * 
     */
    public Keywords createKeywords() {
        return new Keywords();
    }

    /**
     * Create an instance of {@link Keyword }
     * 
     */
    public Keyword createKeyword() {
        return new Keyword();
    }

    /**
     * Create an instance of {@link ExternalIdentifiers }
     * 
     */
    public ExternalIdentifiers createExternalIdentifiers() {
        return new ExternalIdentifiers();
    }

    /**
     * Create an instance of {@link ExternalIdentifier }
     * 
     */
    public ExternalIdentifier createExternalIdentifier() {
        return new ExternalIdentifier();
    }

    /**
     * Create an instance of {@link ExternalIdCommonName }
     * 
     */
    public ExternalIdCommonName createExternalIdCommonName() {
        return new ExternalIdCommonName();
    }

    /**
     * Create an instance of {@link Delegation }
     * 
     */
    public Delegation createDelegation() {
        return new Delegation();
    }

    /**
     * Create an instance of {@link GivenPermissionTo }
     * 
     */
    public GivenPermissionTo createGivenPermissionTo() {
        return new GivenPermissionTo();
    }

    /**
     * Create an instance of {@link GivenPermissionBy }
     * 
     */
    public GivenPermissionBy createGivenPermissionBy() {
        return new GivenPermissionBy();
    }

    /**
     * Create an instance of {@link Applications }
     * 
     */
    public Applications createApplications() {
        return new Applications();
    }

    /**
     * Create an instance of {@link OrcidActivities }
     * 
     */
    public OrcidActivities createOrcidActivities() {
        return new OrcidActivities();
    }

    /**
     * Create an instance of {@link Affiliations }
     * 
     */
    public Affiliations createAffiliations() {
        return new Affiliations();
    }

    /**
     * Create an instance of {@link Affiliation }
     * 
     */
    public Affiliation createAffiliation() {
        return new Affiliation();
    }

    /**
     * Create an instance of {@link OrcidInternal }
     * 
     */
    public OrcidInternal createOrcidInternal() {
        return new OrcidInternal();
    }

    /**
     * Create an instance of {@link OrcidSearchResults }
     * 
     */
    public OrcidSearchResults createOrcidSearchResults() {
        return new OrcidSearchResults();
    }

    /**
     * Create an instance of {@link OrcidSearchResult }
     * 
     */
    public OrcidSearchResult createOrcidSearchResult() {
        return new OrcidSearchResult();
    }

    /**
     * Create an instance of {@link ErrorDesc }
     * 
     */
    public ErrorDesc createErrorDesc() {
        return new ErrorDesc();
    }

    /**
     * Create an instance of {@link Orcid }
     * 
     */
    public Orcid createOrcid() {
        return new Orcid();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrcidId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orcid.org/ns/orcid", name = "source-orcid")
    public JAXBElement<OrcidId> createSourceOrcid(OrcidId value) {
        return new JAXBElement<OrcidId>(_SourceOrcid_QNAME, OrcidId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orcid.org/ns/orcid", name = "locale")
    public JAXBElement<String> createLocale(String value) {
        return new JAXBElement<String>(_Locale_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orcid.org/ns/orcid", name = "work-type")
    public JAXBElement<String> createWorkType(String value) {
        return new JAXBElement<String>(_WorkType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orcid.org/ns/orcid", name = "message-version")
    public JAXBElement<String> createMessageVersion(String value) {
        return new JAXBElement<String>(_MessageVersion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orcid.org/ns/orcid", name = "funding-contributor-role")
    public JAXBElement<String> createFundingContributorRole(String value) {
        return new JAXBElement<String>(_FundingContributorRole_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orcid.org/ns/orcid", name = "send-member-update-requests")
    public JAXBElement<Boolean> createSendMemberUpdateRequests(Boolean value) {
        return new JAXBElement<Boolean>(_SendMemberUpdateRequests_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orcid.org/ns/orcid", name = "disambiguated-organization-identifier")
    public JAXBElement<String> createDisambiguatedOrganizationIdentifier(String value) {
        return new JAXBElement<String>(_DisambiguatedOrganizationIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orcid.org/ns/orcid", name = "funding-type")
    public JAXBElement<String> createFundingType(String value) {
        return new JAXBElement<String>(_FundingType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orcid.org/ns/orcid", name = "salesforce-id")
    public JAXBElement<String> createSalesforceId(String value) {
        return new JAXBElement<String>(_SalesforceId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orcid.org/ns/orcid", name = "contributor-sequence")
    public JAXBElement<String> createContributorSequence(String value) {
        return new JAXBElement<String>(_ContributorSequence_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orcid.org/ns/orcid", name = "source-client-id")
    public JAXBElement<ClientId> createSourceClientId(ClientId value) {
        return new JAXBElement<ClientId>(_SourceClientId_QNAME, ClientId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orcid.org/ns/orcid", name = "disambiguation-source")
    public JAXBElement<String> createDisambiguationSource(String value) {
        return new JAXBElement<String>(_DisambiguationSource_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrcidId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orcid.org/ns/orcid", name = "contributor-orcid")
    public JAXBElement<OrcidId> createContributorOrcid(OrcidId value) {
        return new JAXBElement<OrcidId>(_ContributorOrcid_QNAME, OrcidId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orcid.org/ns/orcid", name = "host")
    public JAXBElement<String> createHost(String value) {
        return new JAXBElement<String>(_Host_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orcid.org/ns/orcid", name = "path")
    public JAXBElement<String> createPath(String value) {
        return new JAXBElement<String>(_Path_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrcidId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orcid.org/ns/orcid", name = "work-source")
    public JAXBElement<OrcidId> createWorkSource(OrcidId value) {
        return new JAXBElement<OrcidId>(_WorkSource_QNAME, OrcidId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orcid.org/ns/orcid", name = "send-email-frequency-days")
    public JAXBElement<String> createSendEmailFrequencyDays(String value) {
        return new JAXBElement<String>(_SendEmailFrequencyDays_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orcid.org/ns/orcid", name = "short-description")
    public JAXBElement<String> createShortDescription(String value) {
        return new JAXBElement<String>(_ShortDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrcidId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orcid.org/ns/orcid", name = "orcid-identifier")
    public JAXBElement<OrcidId> createOrcidIdentifier(OrcidId value) {
        return new JAXBElement<OrcidId>(_OrcidIdentifier_QNAME, OrcidId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orcid.org/ns/orcid", name = "work-external-identifier-type")
    public JAXBElement<String> createWorkExternalIdentifierType(String value) {
        return new JAXBElement<String>(_WorkExternalIdentifierType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orcid.org/ns/orcid", name = "funding-external-identifier-type")
    public JAXBElement<String> createFundingExternalIdentifierType(String value) {
        return new JAXBElement<String>(_FundingExternalIdentifierType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrcidId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orcid.org/ns/orcid", name = "application-orcid")
    public JAXBElement<OrcidId> createApplicationOrcid(OrcidId value) {
        return new JAXBElement<OrcidId>(_ApplicationOrcid_QNAME, OrcidId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orcid.org/ns/orcid", name = "organization-defined-type")
    public JAXBElement<String> createOrganizationDefinedType(String value) {
        return new JAXBElement<String>(_OrganizationDefinedType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Citation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orcid.org/ns/orcid", name = "work-citation")
    public JAXBElement<Citation> createWorkCitation(Citation value) {
        return new JAXBElement<Citation>(_WorkCitation_QNAME, Citation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orcid.org/ns/orcid", name = "work-external-identifier-id")
    public JAXBElement<String> createWorkExternalIdentifierId(String value) {
        return new JAXBElement<String>(_WorkExternalIdentifierId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orcid.org/ns/orcid", name = "contributor-role")
    public JAXBElement<String> createContributorRole(String value) {
        return new JAXBElement<String>(_ContributorRole_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orcid.org/ns/orcid", name = "uri", scope = ClientId.class)
    public JAXBElement<String> createClientIdUri(String value) {
        return new JAXBElement<String>(_ClientIdUri_QNAME, String.class, ClientId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orcid.org/ns/orcid", name = "path", scope = ClientId.class)
    public JAXBElement<String> createClientIdPath(String value) {
        return new JAXBElement<String>(_Path_QNAME, String.class, ClientId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orcid.org/ns/orcid", name = "uri", scope = OrcidId.class)
    public JAXBElement<String> createOrcidIdUri(String value) {
        return new JAXBElement<String>(_ClientIdUri_QNAME, String.class, OrcidId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orcid.org/ns/orcid", name = "path", scope = OrcidId.class)
    public JAXBElement<String> createOrcidIdPath(String value) {
        return new JAXBElement<String>(_Path_QNAME, String.class, OrcidId.class, value);
    }

}
