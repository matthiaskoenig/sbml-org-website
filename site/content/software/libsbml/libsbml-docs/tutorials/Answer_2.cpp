/**
 * @file    answer_2.cpp
 * @brief   Solution to tutorial example exercise 2
 * @author  Sarah Keating
 */


#include <iostream>
#include <sstream>

#include <sbml/SBMLTypes.h>


using namespace std;
LIBSBML_CPP_NAMESPACE_USE

int
main (int argc, char* argv[])
{
  SBMLDocument *d = new SBMLDocument(3,1);

  Model *m = d->createModel();

  // create the parameters
  Parameter * p1 = m->createParameter();
  p1->setId("p1");
  p1->setUnits("metre");
  p1->setConstant(true);

  Parameter * p2 = m->createParameter();
  p2->setId("p2");
  p2->setUnits("metre");
  p2->setConstant(true);

  Parameter * p3 = m->createParameter();
  p3->setId("p3");
  p3->setUnits("metre_sq");
  p3->setConstant(false);

  Parameter * p4 = m->createParameter();
  p4->setId("p4");
  p4->setUnits("metre_sq_per_sec");
  p4->setConstant(false);


  // value of p2 is assigned by initialAssignment

  InitialAssignment *ia = m->createInitialAssignment();
  ia->setSymbol("p2");
  ia->setMath(SBML_parseFormula("3*p1"));

  // value of p3 is by assignment rule

  AssignmentRule *ar = m->createAssignmentRule();
  ar->setVariable("p3");
  ar->setMath(SBML_parseFormula("p1*p2"));

  // p4 is a rate rule

  RateRule *rr = m->createRateRule();
  rr->setVariable("p4");

  ASTNode *time = new ASTNode(AST_NAME_TIME);
  time->setName("t");
  ASTNode *ast = SBML_parseFormula("p3");
  ASTNode *divide = new ASTNode(AST_DIVIDE);
  divide->addChild(ast);
  divide->addChild(time);

  rr->setMath(divide);

  // now put in unit definitions for the units I used
  UnitDefinition * ud1 = m->createUnitDefinition();
  ud1->setId("metre_sq");
  Unit * u = ud1->createUnit();
  u->setKind(UNIT_KIND_METRE);
  u->setExponent(2);
  u->setScale(0);
  u->setMultiplier(1);

  UnitDefinition * ud2 = m->createUnitDefinition();
  ud2->setId("metre_sq_per_sec");
  Unit * u1 = ud2->createUnit();
  u1->setKind(UNIT_KIND_METRE);
  u1->setExponent(2);
  u1->setScale(0);
  u1->setMultiplier(1);
  Unit * u2 = ud2->createUnit();
  u2->setKind(UNIT_KIND_SECOND);
  u2->setExponent(-1);
  u2->setScale(0);
  u2->setMultiplier(1);

  writeSBML(d, "Model_2.xml");

  return 0;
}

