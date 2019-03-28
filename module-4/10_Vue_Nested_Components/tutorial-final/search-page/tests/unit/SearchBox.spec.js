import SearchBox from '@/components/SearchBox.vue';
/* eslint-disable-next-line no-unused-vars */
import { shallowMount, Wrapper } from '@vue/test-utils';
import fetchMock from 'fetch-mock';

import chai from 'chai';
chai.should();

describe('SearchBox', () => {
  /** @type Wrapper */
  let wrapper;
  beforeEach( () => {
    wrapper = shallowMount(SearchBox);
  });

  before( () => {
    fetchMock.config.overwriteRoutes = true;
  });

  it('should send results when performSearch is called', (done) => {
    fetchMock.get('*', { 'Results': 'TEST' });

    wrapper.setProps({ searchUrl: 'http://test.mock/' });
    wrapper.setData({ search: 'TEST' });

    wrapper.vm.performSearch().then(() => {
      let data = wrapper.emitted('search-results');
      // Get the first event of that type and it's first parameter
      data[0][0].Results.should.equal('TEST');
      done();
    });
  });
});